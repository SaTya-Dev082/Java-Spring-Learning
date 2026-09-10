
/*======================
    AppRunner first version
======================
*/
// package com.satya.springdemo;

// import com.satya.springdemo.service.UserService;
// import org.springframework.boot.CommandLineRunner;
// import org.springframework.stereotype.Component;

// @Component
// public class AppRunner implements CommandLineRunner {

//     private final UserService userService;

//     public AppRunner(UserService userService) {
//         this.userService = userService;
//     }

//     @Override
//     public void run(String... args) {
//         userService.registerUser();
//     }
// }




/*======================
    AppRunner second version
======================
*/

package com.satya.springdemo;


import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.satya.springdemo.icodiconcept.order.OrderService;

@Component
public class AppRunner implements CommandLineRunner {

    private final OrderService orderService;

    public AppRunner(OrderService orderService) {
        this.orderService = orderService;
    }

    @Override
    public void run(String... args) {
        orderService.createOrder();
    }
}