package com.loop.test.day8_webtables_config;

import com.loop.test.base.TestBase;
import com.loop.test.utility.DocuportConstants;
import com.loop.test.utility.DocuportUtils;
import org.testng.annotations.Test;

public class T1login_docuport extends TestBase {


    @Test
    public void test_login_docuport()  {

        DocuportUtils.login(driver, DocuportConstants.CLIENT);
        DocuportUtils.logOut(driver);

        DocuportUtils.login(driver, DocuportConstants.ADVISOR);
        DocuportUtils.logOut(driver);

        DocuportUtils.login(driver, DocuportConstants.EMPLOYEE);
        DocuportUtils.logOut(driver);

        DocuportUtils.login(driver, DocuportConstants.SUPERVISOR);
        DocuportUtils.logOut(driver);
    }
}
