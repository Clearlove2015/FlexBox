package com.odbpo.fenggo.flexbox.bean;

/**
 * @author: zc
 * @Time: 2019/9/5 13:14
 * @Desc:
 */
public class GiftBean {
    /**
     * name : 好孩子 防水充电型宝宝理发器 婴幼儿电动理发器(灰色)
     * id : 78
     * presentScopeId : 748
     * specDesc : 灰色
     * scopeNum : 1
     * image : http://img.feng-go.com/1479704435042.jpg!160
     * stock : 7
     * fullBuyPresentMarketingId : 68
     * checked : true
     * addedStatus : 1
     */

    private String name;
    private int id;
    private int presentScopeId;
    private String specDesc;
    private int scopeNum;
    private String image;
    private int stock;
    private int fullBuyPresentMarketingId;
    private boolean checked;
    private String addedStatus;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPresentScopeId() {
        return presentScopeId;
    }

    public void setPresentScopeId(int presentScopeId) {
        this.presentScopeId = presentScopeId;
    }

    public String getSpecDesc() {
        return specDesc;
    }

    public void setSpecDesc(String specDesc) {
        this.specDesc = specDesc;
    }

    public int getScopeNum() {
        return scopeNum;
    }

    public void setScopeNum(int scopeNum) {
        this.scopeNum = scopeNum;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getFullBuyPresentMarketingId() {
        return fullBuyPresentMarketingId;
    }

    public void setFullBuyPresentMarketingId(int fullBuyPresentMarketingId) {
        this.fullBuyPresentMarketingId = fullBuyPresentMarketingId;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public String getAddedStatus() {
        return addedStatus;
    }

    public void setAddedStatus(String addedStatus) {
        this.addedStatus = addedStatus;
    }
}
