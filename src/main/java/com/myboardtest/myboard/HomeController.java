package com.myboardtest.myboard;

import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.myboardtest.dao.boardDAO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    // @Autowired
    // private SqlSessionTemplate sqlSession;

    /**
     * Simply selects the home view to render by returning its name.
     */
    @Autowired
    private boardDAO dao;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Locale locale, Model model) {
        logger.info("Welcome home! The client locale is {}.", locale);

        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

        String formattedDate = dateFormat.format(date);

        model.addAttribute("serverTime", formattedDate);

        // System.out.println(sqlSession.selectOne("SELECT * FROM BOARD"));
        /*
         * boardDAO dao = new boardDAO();
         */
        System.out.println(dao.selectCount());
        System.out.println(dao.selectList());

        Map<String, Object> test = new HashMap<String, Object>();
        List<Map<String, Object>> list = dao.selectList();
        model.addAttribute("result", list);

        return "home";
    }

}
