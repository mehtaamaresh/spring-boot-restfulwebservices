package com.amy.company.restfulwebservices.Users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserDaoService userDaoService;

    @GetMapping(path="/users")
    public List<UserBean> retrieveAllUsers(){
    //public MappingJacksonValue retrieveAllUsers(){

        //Dynamic Filtering
        //SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("name");
        //FilterProvider provider = new SimpleFilterProvider().addFilter("UserBean", filter);
        //MappingJacksonValue mapping = new MappingJacksonValue(userDaoService.findAll());
        //mapping.setFilters(provider);
        //return mapping;

        return userDaoService.findAll();

    }

    @GetMapping(path="/users/{id}")
    public UserBean retrieveUser(@PathVariable int id){
         //public Resource<UserBean> retrieveUser(@PathVariable int id){
        UserBean user = userDaoService.findOne(id);
        if(user==null){
            throw new UserNotFoundException("Not found "+id);
        }else{
            //Resource<UserBean> resource = new Resource<>(user);
            //Deprecated// ControllerLinkBuilder.linkTo(ControllerLinkBuilder.methodOn(this.getClass()).retrieveAllUsers());
            //WebMvcLinkBuilder webMvcLinkBuilder =
            //WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(this.getClass()).retrieveAllUsers());  // .withRel("all-users");
            //resource.add(webMvcLinkBuilder.withRel("all-users"));

            return user;
            //return resource; //user with links

        }

    }

    @PostMapping(path="/users")
    //old public void createUser(@RequestBody UserBean user){
    public ResponseEntity createUser(@Valid @RequestBody UserBean user){
        UserBean savedUser = userDaoService.save(user);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedUser.getId())
                .toUri();
        return ResponseEntity.created(location).build();
    }

    @DeleteMapping(path="/users/{id}")
    public void deleteUser(@PathVariable int id){
        UserBean user = userDaoService.deleteById(id);

        if(user == null){
            throw new UserNotFoundException("Not Found "+ id);
        }
    }
}
