package cn.itcast.jk.controller.baseinfo.factory;

import cn.itcast.jk.controller.BaseController;
import cn.itcast.jk.domain.FactoryC;
import cn.itcast.jk.service.FactoryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * FactoryController
 * todo
 *
 * @author kujin
 * 创建时间：2020/10/10
 * @version 1
 */
@Controller
public class FactoryController extends BaseController {
    @Resource
    FactoryService factoryService;

    @RequestMapping("/baseinfo/factory/list.action")
    public String list(Model model){
        List<FactoryC> dataList = factoryService.find(null);
        model.addAttribute("dataList",dataList);    //将数据传递到页面
        return "/baseinfo/factory/jFactory.jsp";   //转向页面
    }
}
