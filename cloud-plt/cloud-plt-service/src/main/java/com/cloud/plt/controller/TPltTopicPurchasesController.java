package com.cloud.plt.controller;

import com.cloud.admin.api.IUserService;
import com.cloud.admin.beans.po.SysUser;
import com.cloud.common.util.base.Result;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cloud.plt.beans.po.TPltTopicPurchases;
import com.cloud.plt.service.TPltTopicPurchasesService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.access.prepost.PreAuthorize;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

/**
 * 促销品表
 *
 * @author Aijm
 * @date 2019-12-28 15:56:54
 */
@RestController
@RequestMapping("/tplttopicpurchases" )
@Api(value = "tplttopicpurchases", tags = "tplttopicpurchases管理")
@Slf4j
public class TPltTopicPurchasesController {

    @Autowired
    private TPltTopicPurchasesService tPltTopicPurchasesService;

    @Autowired
    private IUserService userService;

    /**
     * 分页查询
     * @param page 分页对象
     * @param tPltTopicPurchases 促销品表
     * @return
     */
    @GetMapping("/page")
    @PreAuthorize("@pms.hasPermission('plt_tplttopicpurchases_view')")
    public Result getTPltTopicPurchasesPage(Page page, TPltTopicPurchases tPltTopicPurchases) {
        return Result.success(tPltTopicPurchasesService.page(page, Wrappers.query(tPltTopicPurchases)));
    }


    /**
     * 通过id查询促销品表
     * @param id id
     * @return Result
     */
    @GetMapping("/{id}")
    //@PreAuthorize("@pms.hasPermission('plt_tplttopicpurchases_view')")
    public Result getById(@PathVariable("id") String id) {
        return Result.success(tPltTopicPurchasesService.getById(id));
    }

    /**
     * 新增促销品表
     * @param tPltTopicPurchases 促销品表
     * @return Result
     */
    @PostMapping
    @PreAuthorize("@pms.hasPermission('plt_tplttopicpurchases_add')")
    public Result save(@RequestBody @Valid TPltTopicPurchases tPltTopicPurchases) {
        return Result.success(tPltTopicPurchasesService.save(tPltTopicPurchases));
    }

    /**
     * 修改促销品表
     * @param tPltTopicPurchases 促销品表
     * @return Result
     */
    @PutMapping
    //@PreAuthorize("@pms.hasPermission('plt_tplttopicpurchases_edit')")
    public Result updateById(@RequestBody @Valid TPltTopicPurchases tPltTopicPurchases) {
        return Result.success(tPltTopicPurchasesService.updateById(tPltTopicPurchases));
    }

    /**
     * 通过id删除促销品表
     * @param id id
     * @return Result
     */
    @DeleteMapping("/{id}")
    //@PreAuthorize("@pms.hasPermission('plt_tplttopicpurchases_del')")
    public Result removeById(@PathVariable String id) {
        return Result.success(tPltTopicPurchasesService.removeById(id));
    }

//    @GetMapping("/Login/{loginName}")
//    public Result userInfoByLoginName(@PathVariable String loginName) {
//        SysUser sysUser = userService.infoTest();
//        String loginName1 = sysUser.getLoginName();
//        return Result.success(sysUser);
//    }

    @GetMapping("/test")
    public Result testInfo() {
        String s = userService.infoTest();
        return Result.success(s);
    }

}
