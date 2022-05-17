package com.nagarro.controller;

import com.nagarro.model.Tshirt;
import com.nagarro.repositories.LoginRepository;
import com.nagarro.repositories.TshirtRepository;
import com.nagarro.services.TshirtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.text.ParseException;
import java.util.List;

@RestController
public class TshirtController {

//    @RequestMapping(value="/", method = RequestMethod.GET)
//    public String showLoginPage(ModelMap model){
//        return new String("index");
//    }
    @Autowired
    private TshirtService tshirtService;

    @Autowired
    private  TshirtRepository tshirtRepository;

    @Autowired
    private LoginRepository loginRepository;

//    @GetMapping("/")
//    public ModelAndView home() {
////        return Constant.homeView;
//        return new ModelAndView("login");
//    }


//    @GetMapping("/logout")
//    public String logout(HttpServletRequest request) {
//        HttpSession session = request.getSession();
////        session.setAttribute(Constant.currUser, null);
//        session.setAttribute("currUser", null);
////        return Constant.homeView;
//        return new String("login");
//
//    }

//    @PostMapping("/login")
//    public ModelAndView login(User user, HttpServletRequest request) throws URISyntaxException {
//        ModelAndView mv = new ModelAndView();
//
//        HttpHeaders headers = new HttpHeaders();
//        headers.setContentType(MediaType.APPLICATION_JSON);
//
//        URI uri = new URI("http://localhost:8181/login");
//        User userData = new User();
//
//        userData.setUsername(user.getUsername());
//        userData.setPassword(user.getPassword());
//
//        HttpEntity<User> httpEntity = new HttpEntity<>(userData, headers);
//
//        RestTemplate restTemplate = new RestTemplate();
//        User userModel = restTemplate.postForObject(uri, httpEntity, User.class);
//        System.out.println(userModel.toString());
//
//        if(Objects.nonNull(userModel)) {
//
//            HttpSession session = request.getSession();
////            List<Tshirt> tshirt = bookService.getBookDetails();
////            mv.addObject(Constant.bookList, bookList);
////            session.setAttribute(Constant.currUser, user.getUsername());
//            session.setAttribute("currUser", user.getUsername());
//
////            mv.setViewName(Constant.bookListing);
//            mv.setViewName("index");
//
//            return mv;
//        }
//        else {
//            mv.setViewName("login");
//            return mv;
//        }
//    }

    @RequestMapping(value="/home", method = RequestMethod.GET)
    public ModelAndView tshirtSearchPage() {
        return new ModelAndView ("home");
    }

    // api for going to results page
//    @GetMapping("/search")
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    public ModelAndView search(String colour, String size, String gender_recommendation,String sortingType) throws ParseException, ParseException {

        ModelAndView mv=new ModelAndView("tshirtresult");
        List<Tshirt> tshirts=tshirtService.searchTshirts(colour,size,gender_recommendation,sortingType);
//        mv.addObject("tshirts", tshirts);

//        Iterable<Tshirt> tshirts = tshirtRepository.findAll();
//        for(Tshirt x:users){
//            System.out.println(x.getId());
//            System.out.println(x.getName());
//            System.out.println(x.getColour());
//        }
        mv.addObject("tshirts", tshirts);

        return mv;
    }





}
