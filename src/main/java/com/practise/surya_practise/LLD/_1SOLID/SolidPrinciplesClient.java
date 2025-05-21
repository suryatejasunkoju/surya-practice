package com.practise.surya_practise.LLD._1SOLID;

import com.practise.surya_practise.LLD._1SOLID._1SingleResponsibility.fix.SingleResponsibilityFix;
import com.practise.surya_practise.LLD._1SOLID._1SingleResponsibility.issue.SingleResponsibilityIssue;
import com.practise.surya_practise.LLD._1SOLID._2OpenForExtensionClosedForModification.fix.OpenForExtensionClosedForModificationFix;
import com.practise.surya_practise.LLD._1SOLID._2OpenForExtensionClosedForModification.issue.OpenForExtensionClosedForModificationIssue;

public class SolidPrinciplesClient
{

    public static void run() {
        //		SOLID Principles:
        SingleResponsibilityIssue.run();
        SingleResponsibilityFix.run();
        OpenForExtensionClosedForModificationIssue.run();
        OpenForExtensionClosedForModificationFix fix = new OpenForExtensionClosedForModificationFix();
        fix.run();
        OpenForExtensionClosedForModificationFix.run();
    }
}
