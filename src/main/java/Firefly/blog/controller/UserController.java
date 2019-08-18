package Firefly.blog.controller;



import Firefly.blog.entity.User;
import Firefly.blog.service.UserService;
import Firefly.blog.util.Result;
import Firefly.blog.util.ResultUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;



@RequestMapping("/user")
@RestController
@Api(tags = "UserController")
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "新增一位用户")
    @PostMapping("/add")
    public Result<Object> add(@RequestBody @Valid User user) {
        userService.addUser(user);
        return ResultUtil.success();
    }



}
