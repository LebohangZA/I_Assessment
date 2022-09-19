package PageFactory;

public class SignUpForInsightsElements {

    public String InvestecLogo(){
        return "//*[@class='injected-svg js-svg-icon svg-icon']";
    }

    public String CookiesPopUp(){
        return "//button[@class='onetrust-close-btn-handler onetrust-close-btn-ui banner-close-button ot-close-icon']";
    }

    public String SearchIcon(){
        return "//div[@class='js-search-hitArea search-toggler__hitArea']";
    }

    public String SearchBarInput(){
        return "(//*[@id='searchBarInput'])";
    }

    public String UnderstandingCashInvestmentLink(){
        return "//a[@href='https://www.investec.com/en_za/focus/money/understanding-interest-rates.html']";
    }

    public String SignUpBTN(){
        return "(//div[@class='col-12']//div/button)[1]";
    }

    public String InputName(){
        return "//input[@name='name']";
    }

    public String InputSurname(){
        return "//input[@name='surname']";
    }

    public String InputEmailAddress(){
        return "//input[@name='email']";
    }

    public String MyselfRadioBTN(){
        return "(//div[@class='checkbox-input__button-copy ng-binding'])[1]";
    }

    public String SubmitBTN(){
        return "//button[@class='forms__submit cta-primary']";
    }

    public String VerificationText(){
        return "//h3[@class = 'thank-you__heading']";
    }
}
