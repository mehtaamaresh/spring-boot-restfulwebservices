package com.amy.company.restfulwebservices.Users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
public class UserJPAController {

    //@Autowired //It is migrated now
    //private UserDaoService userDaoService;

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PostsRepository postsRepository;

    @GetMapping(path="/jpa/users")
    public List<UserBean> retrieveAllUsers(){
        return userRepository.findAll();
    }

    @GetMapping(path="/jpa/users/{id}")
    public Optional<UserBean> retrieveUser(@PathVariable int id){
    //public Resource<UserBean> retrieveUser(@PathVariable int id){
        //UserBean user = userDaoService.findOne(id);
        Optional<UserBean> user = userRepository.findById(id);
        if(!user.isPresent()){
            throw new UserNotFoundException("Not found "+id);
        }else{
            //Resource<UserBean> resource = new Resource<UserBean>(user.get());
            //Deprecated// ControllerLinkBuilder.linkTo(ControllerLinkBuilder.methodOn(this.getClass()).retrieveAllUsers());
            //WebMvcLinkBuilder webMvcLinkBuilder =
            //WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(this.getClass()).retrieveAllUsers());  // .withRel("all-users");
            //resource.add(webMvcLinkBuilder.withRel("all-users"));

            return user;
            //return resource; //user with links

        }

    }

    @PostMapping(path="/jpa/users")
    //old public void createUser(@RequestBody UserBean user){
    public ResponseEntity createUser(@Valid @RequestBody UserBean user){
        UserBean savedUser = userRepository.save(user);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedUser.getId())
                .toUri();
        return ResponseEntity.created(location).build();
    }

    @DeleteMapping(path="/jpa/users/{id}")
    public void deleteUser(@PathVariable int id){
        userRepository.deleteById(id);
    }

    @GetMapping(path="/jpa/users/{id}/posts")
    public List<PostsBean> retrieveUserPosts(@PathVariable int id){
        Optional<UserBean> user = userRepository.findById(id);

        if(!user.isPresent()){
            throw new UserNotFoundException("Not found "+id);
        }else{
            return user.get().getPosts();
        }
    }

    @PostMapping(path="/jpa/users/{id}/posts")
    public ResponseEntity createUserPosts(@Valid @PathVariable int id, @RequestBody PostsBean post){
        Optional<UserBean> user = userRepository.findById(id);

        if(!user.isPresent()){
            throw new UserNotFoundException("Not found "+id);
        }else{
            UserBean userForPosts = user.get();
            post.setUser(userForPosts);
            postsRepository.save(post);
        }

        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(post.getId())
                .toUri();
        return ResponseEntity.created(location).build();

    }



    }
