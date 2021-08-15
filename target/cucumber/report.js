$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/Customer.feature");
formatter.feature({
  "line": 1,
  "name": "Sign in testcases",
  "description": "",
  "id": "sign-in-testcases",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "SignIn Testcase001",
  "description": "",
  "id": "sign-in-testcases;signin-testcase001",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Open browser Navigate to \"http://www.automationpractice.com\"",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Click on the ContactUs",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user fills the form using Sheet name \u003cSheetname\u003e and rowno \u003cRowno\u003e",
  "keyword": "When "
});
formatter.examples({
  "comments": [
    {
      "line": 7,
      "value": "#When click on submit button"
    },
    {
      "line": 8,
      "value": "#Then it show a successfull message \"Your message has been successfully sent to our team.\""
    }
  ],
  "line": 9,
  "name": "",
  "description": "",
  "id": "sign-in-testcases;signin-testcase001;",
  "rows": [
    {
      "cells": [
        "Sheetname",
        "Rowno"
      ],
      "line": 10,
      "id": "sign-in-testcases;signin-testcase001;;1"
    },
    {
      "cells": [
        "contact",
        "0"
      ],
      "line": 11,
      "id": "sign-in-testcases;signin-testcase001;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 11,
  "name": "SignIn Testcase001",
  "description": "",
  "id": "sign-in-testcases;signin-testcase001;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Open browser Navigate to \"http://www.automationpractice.com\"",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Click on the ContactUs",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user fills the form using Sheet name contact and rowno 0",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.automationpractice.com",
      "offset": 26
    }
  ],
  "location": "StepDefinations.open_browser_navigate_to_something(String)"
});
formatter.result({
  "duration": 90086654052,
  "error_message": "org.openqa.selenium.WebDriverException: chrome not reachable\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027HOME\u0027, ip: \u0027192.168.1.12\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u002715.0.2\u0027\nDriver info: driver.version: ChromeDriver\nremote stacktrace: Backtrace:\n\tOrdinal0 [0x00EE2DB3+2502067]\n\tOrdinal0 [0x00E7C5B1+2082225]\n\tOrdinal0 [0x00D82360+1057632]\n\tOrdinal0 [0x00D77325+1012517]\n\tOrdinal0 [0x00D9FF1B+1179419]\n\tOrdinal0 [0x00D9C43C+1164348]\n\tOrdinal0 [0x00D99C73+1154163]\n\tOrdinal0 [0x00DC9A22+1350178]\n\tOrdinal0 [0x00DC967A+1349242]\n\tOrdinal0 [0x00DC5BEB+1334251]\n\tOrdinal0 [0x00DA2174+1188212]\n\tOrdinal0 [0x00DA3009+1191945]\n\tGetHandleVerifier [0x0105EC5C+1511084]\n\tGetHandleVerifier [0x01108522+2205554]\n\tGetHandleVerifier [0x00F63393+480739]\n\tGetHandleVerifier [0x00F62579+477129]\n\tOrdinal0 [0x00E81E5D+2104925]\n\tOrdinal0 [0x00E863F8+2122744]\n\tOrdinal0 [0x00E86537+2123063]\n\tOrdinal0 [0x00E8EE53+2158163]\n\tBaseThreadInitThunk [0x75F1344D+18]\n\tRtlInitializeExceptionChain [0x77489802+99]\n\tRtlInitializeExceptionChain [0x774897D5+54]\n\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:64)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.W3CHandshakeResponse.lambda$errorHandler$0(W3CHandshakeResponse.java:62)\r\n\tat org.openqa.selenium.remote.HandshakeResponse.lambda$getResponseFunction$0(HandshakeResponse.java:30)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.lambda$createSession$0(ProtocolHandshake.java:126)\r\n\tat java.base/java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:195)\r\n\tat java.base/java.util.Spliterators$ArraySpliterator.tryAdvance(Spliterators.java:958)\r\n\tat java.base/java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:127)\r\n\tat java.base/java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:502)\r\n\tat java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:488)\r\n\tat java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)\r\n\tat java.base/java.util.stream.FindOps$FindOp.evaluateSequential(FindOps.java:150)\r\n\tat java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)\r\n\tat java.base/java.util.stream.ReferencePipeline.findFirst(ReferencePipeline.java:543)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:128)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:74)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:136)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.startSession(RemoteWebDriver.java:213)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:131)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:181)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:168)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:123)\r\n\tat testbase.TestBase.setup(TestBase.java:22)\r\n\tat stepDefinations.StepDefinations.open_browser_navigate_to_something(StepDefinations.java:42)\r\n\tat ✽.Given Open browser Navigate to \"http://www.automationpractice.com\"(src/test/java/features/Customer.feature:4)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StepDefinations.click_on_the_contactus()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "contact",
      "offset": 37
    },
    {
      "val": "0",
      "offset": 55
    }
  ],
  "location": "StepDefinations.user_fills_the_form_using_sheet_name_and_rowno(String,int)"
});
formatter.result({
  "status": "skipped"
});
});