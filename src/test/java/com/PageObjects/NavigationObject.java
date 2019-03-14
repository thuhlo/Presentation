package com.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class NavigationObject
{
    //@FindBy(how = How.CLASS_NAME, using = "ico-register")
    @FindBy(how =How.XPATH, using = "//a[@href='/register']")WebElement lnkRegister;
    //private

    @FindBy(how = How.XPATH, using = "/html//div[@class='master-wrapper-page']" +
            "/div[@class='header']//div[@class='header-links']/ul//a[@href='/login']")
    private WebElement lnkLogOrOut;


    @FindBy(how = How.CLASS_NAME, using = "ico-wishlist")
    private WebElement lnkWishList;
    @FindBy(how = How.CLASS_NAME, using = "ico-cart")
    private WebElement lnkCart;
    @FindBy(how = How.CLASS_NAME, using = "customerCurrency")
    private WebElement drpCurrency;
    @FindBy(how = How.ID, using = "small-searchterms")
    private WebElement txtSearchStore;
    @FindBy(how = How.CLASS_NAME, using = "button-1 search-box-button")
    private WebElement btnSearchStore;
    @FindBy(how = How.CSS, using = "body > div.master-wrapper-page > div.header-menu > ul:nth-child(1) > li:nth-child(1) > a")
    private WebElement navComputer;
    @FindBy(how = How.CSS, using = "body > div.master-wrapper-page > div.header-menu > ul:nth-child(1) > li:nth-child(2) > a")
    private WebElement navElectronics;
    @FindBy(how = How.CSS, using = "body > div.master-wrapper-page > div.header-menu > ul:nth-child(1) > li:nth-child(3) > a")
    private WebElement navApparel;
    @FindBy(how = How.CSS, using = "body > div.master-wrapper-page > div.header-menu > ul:nth-child(1) > li:nth-child(4) > a")
    private WebElement navDigitalDownloads;
    @FindBy(how = How.CSS, using = "body > div.master-wrapper-page > div.header-menu > ul:nth-child(1) > li:nth-child(5) > a")
    private WebElement navBooks;
    @FindBy(how = How.CSS, using = "body > div.master-wrapper-page > div.header-menu > ul:nth-child(1) > li:nth-child(6) > a")
    private WebElement navJewelry;
    @FindBy(how = How.CSS, using = "body > div.master-wrapper-page > div.header-menu > ul:nth-child(1) > li:nth-child(7) > a")
    private WebElement navGidtCards;

    public NavigationObject(WebDriver objDriver)
    {
        PageFactory.initElements(objDriver,this);
    }

    public void linkRegister()

    {
        lnkRegister.click();
    }

    public void linkLogInOrOut()
    {
        lnkLogOrOut.click();
    }

    public void linkWishList()
    {
        lnkWishList.click();
    }

    public void linkWishListHover()
    {
        //Get code to hover
    }


    public void linkCart()
    {
        lnkCart.click();
    }

    public void linkCartHover()
    {
        //Get code to hover
    }

    public void drpCurrency()
    {
        Select dropCurrency = new Select(drpCurrency);

        if(drpCurrency.getText().equalsIgnoreCase("US Dollar"))
        {
            dropCurrency.selectByVisibleText("Euro");
        }
        else if(drpCurrency.getText().equalsIgnoreCase("Euro"))
        {
            dropCurrency.selectByVisibleText("US Dollar");
        }
    }

    public void txtSearchStore(String searchStore)
    {
        txtSearchStore.clear();
        txtSearchStore.sendKeys(searchStore);
    }

    public void btnSearchClick()
    {
        btnSearchStore.click();
    }

    public void navComputerMeth()
    {
        navComputer.click();
    }

    public void navElectronicsMeth()
    {
        navElectronics.click();
    }

    public void navApparelMeth()
    {
        navApparel.click();
    }

    public void navDigitalDownloadsMeth()
    {
        navDigitalDownloads.click();
    }

    public void navBooksMeth()
    {
        navBooks.click();
    }

    public void navJewelryMeth()
    {
        navJewelry.click();
    }

    public void navGiftCardsMeth()
    {
        navGidtCards.click();
    }



}
