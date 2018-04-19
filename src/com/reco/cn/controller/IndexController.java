package com.reco.cn.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.reco.cn.dao.ArtDao;
import com.reco.cn.domain.ArtDO;
import com.reco.cn.domain.DesignDO;
import com.reco.cn.service.ArtService;
import com.reco.cn.service.DesignService;

@Controller
@RequestMapping("/index")
public class IndexController {
    @Autowired
    private DesignService designService;
    @Autowired
    private ArtService artService;

    @RequestMapping()
    ModelAndView index(HttpServletRequest request) {
        ModelAndView mv = new ModelAndView();
        List<DesignDO> designlist = designService.list(null);
        Map<String, Object> expertmap = new HashMap<>();
        expertmap.put("is_exp", "1");
        List<ArtDO> expertlist = artService.list(expertmap);
        Map<String, Object> artmap = new HashMap<>();
        artmap.put("is_exp", "0");
        List<ArtDO> artlist = artService.list(artmap);
        mv.addObject("designlist", designlist);
        mv.addObject("artlist", artlist);
        mv.setViewName("front/index");
        return mv;

    }

    @RequestMapping("/pot")
    ModelAndView pot(HttpServletRequest request, Integer designId) {
        ModelAndView mv = new ModelAndView();
        DesignDO design = designService.get(designId);
        mv.addObject("design", design);
        mv.setViewName("front/pot/potdetail");
        return mv;

    }
}
