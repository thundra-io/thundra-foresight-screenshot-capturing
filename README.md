# Capturing your screenshots with Foresight in Action

![ X](https://blog.thundra.io/hubfs/ken-yeung-VnSjwrAy1PQ-unsplash.png)

Intro
-----

Before we start, probably it’s a good idea to understand why taking screenshots in your software tests is important in the first place.

Automated software testing is a quite young area of software development lifecycle and automated user interface testing is even more! The basic idea behind the automating testing is trying to decrease the time and other resources spent on assuring software products. Especially, that becomes more and more important for a product that changes very frequently such as software.

So when we are automating the testing of a software, by software, we are taking advantage of not repeating the same tasks every time in every code change. So why not take this and apply it to user interface testing!

As we can see, the main advantage of taking screenshots is that, every time one of your tests have an unexpected situation, we are actually saving time from not manually reproducing the same unexpected state and checking the current state of the screen.

What is Thundra Foresight?
--------------------------

Thundra is a platform for developers(not only by developers obviously) and offers **CI/CD, application and software test observability**. It has three different products and we will focus on Foresight and it’s features on test monitoring in this article.

And yes, Thundra Foresight is also offering to capture **you all screenshots you took in your Selenium or BrowserStack tests!**

![](https://blog.thundra.io/hs-fs/hubfs/Google%20Drive%20Integration/Capturing%20your%20screenshots%20with%20Foresight%20in%20Action-Dec-15-2021-10-00-34-49-AM.png?width=403&name=Capturing%20your%20screenshots%20with%20Foresight%20in%20Action-Dec-15-2021-10-00-34-49-AM.png)

What are you going to need?
---------------------------

Although you can send test invocations to Thundra nearly platform agnostically, the easiest way to try Foresight screenshot capturing is below steps.

And you will only need a GitHub account and 10 minutes for that!

Test flight ✈️
--------------

### 1) Signup to Foresight

Go ahead and signup for Thundra from [](https://start.thundra.io/) [https://start.thundra.io/](https://start.thundra.io/)

![](https://blog.thundra.io/hubfs/Google%20Drive%20Integration/Capturing%20your%20screenshots%20with%20Foresight%20in%20Action-Dec-15-2021-10-00-33-52-AM.png)

Click the “Use Foresight” button on Foresight card at the middle after your signup

![](https://blog.thundra.io/hubfs/Google%20Drive%20Integration/Capturing%20your%20screenshots%20with%20Foresight%20in%20Action-Dec-15-2021-10-00-37-24-AM.png)

### 2) Create a project in Foresight

After you land on the repositories page, click either of the “Connect repositories” buttons. 

![](https://blog.thundra.io/hs-fs/hubfs/Google%20Drive%20Integration/Capturing%20your%20screenshots%20with%20Foresight%20in%20Action-Dec-15-2021-10-00-36-03-AM.png?width=624&name=Capturing%20your%20screenshots%20with%20Foresight%20in%20Action-Dec-15-2021-10-00-36-03-AM.png)

After you typed a name for your project and clicked **create**, you should choose **Test Monitoring** in the “Choose how to start” section. Then click on the **Github Actions** option, which is the first one in the “Integrate Foresight agent” section. 

Do you see those two YAML rows at the bottom, they are your **unique**(and private, so keep them safe) keys for Thundra Foresight, and you will need them in the next steps.

![](https://blog.thundra.io/hubfs/Google%20Drive%20Integration/Capturing%20your%20screenshots%20with%20Foresight%20in%20Action-Dec-15-2021-10-00-37-85-AM.png)

Do not worry if you had already clicked the “Continue” button and are redirected to the main page with your newly created project. You can always check those values when you go into the settings page by hovering the project name and clicking the settings button.

![Screen Shot 2021-12-15 at 14.37.56](https://github.com/serkankorkut/public-assets/blob/master/foresigt_1.png)

![image (5)](https://github.com/serkankorkut/public-assets/blob/master/foresight_2.png)

### 3) Fork our sample repo

After you create a Foresight project and keep your api and project key at hand, you can fork this project

[https://github.com/thundra-io/thundra-foresight-screenshot-capturing](https://github.com/thundra-io/thundra-foresight-screenshot-capturing)

to your Github account. This is a sample project which has a test that takes a screenshot of [](//www.thundra.io) [www.thundra.io](//www.thundra.io) website when it’s Github action workflow has triggered. You will only need to pass your keys as repository secrets and trigger your first action run, to make it work. Let’s walk through those steps one by one.

### 4) Create your secrets in the Github action and pass their values

Now you can take your `apikey` and `project_id` from step#2 and pass it as secrets in GitHub or directly paste to GitHub with an eye on yml validity. Let’s see how we can do that!

First, click the “Settings” button in [thundra-foresight-screenshot-capturing](https://github.com/thundra-io/thundra-foresight-screenshot-capturing), then at the left bottom of the options list, you should see the “Secrets” option. Click there and add a new secret by clicking the “New repository secret” button at the top right.

![](https://blog.thundra.io/hubfs/Google%20Drive%20Integration/Capturing%20your%20screenshots%20with%20Foresight%20in%20Action-Dec-15-2021-10-00-35-39-AM.png)

Now you can add a new secret with the name `THUNDRA_FORESIGHT_API_KEY`. For its value, use `apikey` value from step 2.

Repeat this step with a new secret, type `THUNDRA_FORESIGHT_PROJECT_ID` for the name and use  value of `project_id` from the 2nd step’s configuration code.

![image (3)](https://blog.thundra.io/hs-fs/hubfs/image%20(3).png?width=715&name=image%20(3).png)

![image (4)](https://blog.thundra.io/hs-fs/hubfs/image%20(4).png?width=666&name=image%20(4).png)

### 5) Run Github Action

After you add your two keys as your repository secrets to your fork of [thundra-foresight-screenshot-capturing](https://github.com/thundra-io/thundra-foresight-screenshot-capturing), you should navigate to the “Actions” tab in the forked project and click “I understand my workflows, go ahead and enable them”.

Now we are ready for the next step.

![](https://blog.thundra.io/hubfs/Google%20Drive%20Integration/Capturing%20your%20screenshots%20with%20Foresight%20in%20Action-Dec-15-2021-10-00-36-94-AM.png)

After you have enabled your workflows, you can select the only workflow from the left pane and after that, run it by clicking and approving it from opened modal on branch master on the “Run workflow” button from the right-center of the page.

![Screen Shot 2021-12-15 at 14.48.14](https://blog.thundra.io/hs-fs/hubfs/Screen%20Shot%202021-12-15%20at%2014.48.14.png?width=547&name=Screen%20Shot%202021-12-15%20at%2014.48.14.png)

Hurray! 🥳 You have just triggered your first workflow run, that instruments your tests! And one of those tests(and only one actually🤫) was taking a screenshot. Now you can see your test run and it’s screenshot on Foresight!

**Note that Github workflow will run for a while so it may take up a few minutes to see your test runs in your Foresight account.** 

![](https://blog.thundra.io/hs-fs/hubfs/Google%20Drive%20Integration/Capturing%20your%20screenshots%20with%20Foresight%20in%20Action-Dec-15-2021-10-00-36-63-AM.png?width=571&name=Capturing%20your%20screenshots%20with%20Foresight%20in%20Action-Dec-15-2021-10-00-36-63-AM.png)

### 6) Check your tests in Foresight. Here is your test screenshots!

OK, time to check your test run in the Foresight at [](https://foresight.thundra.io/repositories) [https://foresight.thundra.io/repositories](https://foresight.thundra.io/repositories) 

As you can see, Foresight already picked the tests tab in your project card. Noticte that there are details about your latest test run triggered by your Github action workflow. Now you can click on the project title and explore the details of your latest executed tests

![](https://blog.thundra.io/hubfs/Google%20Drive%20Integration/Capturing%20your%20screenshots%20with%20Foresight%20in%20Action-Dec-15-2021-10-00-35-76-AM.png)

As you can see, there is your latest commit message, platform, test counts, and successful, failed, skipped and aborted tests. There are also details about your tests execution duration and trigger time.

You can go ahead and click that test run and there are even more details about it.

![Screen Shot 2021-12-15 at 14.48.51](https://blog.thundra.io/hs-fs/hubfs/Screen%20Shot%202021-12-15%20at%2014.48.51.png?width=692&name=Screen%20Shot%202021-12-15%20at%2014.48.51.png)

Even the slowest test suites(Test class) and slowest individual tests and their duration. That way you can easily identify your hot spots in your CI pipeline’s test phase and optimize them to reduce your time(and probably money spent on the CI provider’s bills that grows with your total run duration).

![](https://blog.thundra.io/hs-fs/hubfs/Google%20Drive%20Integration/Capturing%20your%20screenshots%20with%20Foresight%20in%20Action-Dec-15-2021-10-00-34-85-AM.png?width=624&height=344&name=Capturing%20your%20screenshots%20with%20Foresight%20in%20Action-Dec-15-2021-10-00-34-85-AM.png)

**Now it comes to exciting part**, if we select the only test under the test class of `TakeScreenshotWithThundraForesight`, which is `whenThundraLoaded_thenTakeScreenshot`, and select Screenshots tab as displayed below, we can see all the screenshots that is taken in a single test! 🎉

![](https://blog.thundra.io/hubfs/Google%20Drive%20Integration/Capturing%20your%20screenshots%20with%20Foresight%20in%20Action-Dec-15-2021-10-00-36-30-AM.png)

OK, what just happened here?
----------------------------

So if we sum up what is going on here, you have forked a project that takes a screenshot in one of it’s tests, this project’s CI pipeline is wrapped by Thundra’s agent application on Github(we also have many other alternative agents for different platforms, see reference links at the summary for more detail). This is done by this step.

Note that you should preserve your actual build command instead of this sample command

    command: mvn clean test

when integrating with Thundra Foresight.

    - name: Thundra Maven Test Instrumentation Action
    uses: thundra-io/thundra-maven-test-action@v1
    with:
    apikey: $
    project_id: $
    command: mvn clean test

When your CI pipeline is triggered with Thundra agent from one of our platform options, the agent sends your test run data to your project in Foresight. That way you can observe, monitor and aggregate your CI pipeline runs hence your test runs inside of your pipelines on Foresight!

Summary
-------

In this article, we have evaluated Thundra Foresight’s screenshot capturing feature.

For other options like manual instrumentation or instrumenting on other platforms with Thundra, you can check our documentation here: [https://foresight.docs.thundra.io/](https://foresight.docs.thundra.io/)

Thundra Foresight also offers an end-to-end visibility for your CI pipelines. Check out [Foresight's application on GitHub Marketplace](https://github.com/marketplace/thundra-foresight).

If you are more like a person that prefers further interactive communication, you will be more than welcomed in our Slack community from here: [](https://www.thundra.io/thundra-slack-invitation)[https://www.thundra.io/thundra-slack-invitation](https://www.thundra.io/thundra-slack-invitation)

You can also hit us a message from our support chat panel at the right bottom of our pages, which redirect messages to us, real humans 😏

Hope you enjoyed this article, and if you are up for more, check: [](https://blog.thundra.io/)[https://blog.thundra.io/](https://blog.thundra.io/)

Lastly; if you still haven't stepped into the Thundra's world, [start your journey here](https://start.thundra.io/signup).
