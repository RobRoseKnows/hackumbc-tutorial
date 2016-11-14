# Android Tutorial 2

## 0.1 | Load Project

* Start Android Studio
* Select checkout from version control and choose git
* Paste in the URL: `https://github.com/RobRoseKnows/hackumbc-tutorial.git`
* Press clone and select YES
* Import project from external model
* Select default gradle wrapper and hit OK
* Wait for the project to build

* Make sure both are selected and hit OK
* Setup Frameworks will pop up and Hit OK

## 0.2 | Open Emulator or Connect Phone

### If you have an Android device:

* Go to your device's About screen and tap the build number a bunch of times.
* You are now should have the developer menu available, open it and enable USB Debugging
* Plug in your device to your computer using a Micro-USB cable
* If it asks for authorization, click yes.

### If you do not have an Android device:

* Open the Android Virtual Device Manager (AVD)
* Either create a new AVD with an API version of at least 19
* Do **not** choose an Intel processor.
* Open the virtual device and **leave it open**. That saves time.

## 1.1 | Stuff I Did Beforehand

* Designed the `activity_main.xml` file.
    - Created a TextView with the ID `id_text`
    - Created a ListView with the ID `class_list`
    - Created a Button with the ID `create_button`
* Added String resources.
    - The `current_gpa` string resource has formatting markup.