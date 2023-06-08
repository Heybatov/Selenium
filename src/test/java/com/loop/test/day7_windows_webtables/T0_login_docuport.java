package com.loop.test.day7_windows_webtables;

import com.loop.test.base.TestBase;
import com.loop.test.utility.DocuportConstants;
import com.loop.test.utility.DocuportUtils;
import org.testng.annotations.Test;

public class T0_login_docuport  extends TestBase {

    @Test
    public void test_login_logout(){
        DocuportUtils.login(driver, DocuportConstants.EMPLOYEE);
        DocuportUtils.logOut(driver);
    }
}
