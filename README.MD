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

## 0.3 | Stuff I Did Beforehand

* Designed the `activity_main.xml` file.
    - Created a TextView with the ID `gpa_text`
    - Created a ListView with the ID `class_list`
    - Created a Button with the ID `create_button`
* It's a relative layout, you can see some of the examples of ways to organize them.
* Added String resources.
    - The `current_gpa` string resource has formatting markup.

## 0.4 | The Android APK

* I am not an expert on the inner workings of Android but here's what I do know:
* The Android APK contains a bunch of things that make up an Android app.
* I'm going to refer you to [Wikipedia](https://en.wikipedia.org/wiki/Android_application_package)
    - You should also looks at the android documentation found at [](https://developer.android.com/).
* Contains:
    - `META-INF`: the manifest, and the certificates and hashes
    - `lib`: Processor-specific code
    - `res`: Contains the resources not compiled into `resources.arsc`
    - `assets`: contains things like images, icons, etc. 
    - `AndroidManifest.xml`: meta-data for the Android app.
    - `classes.dex`: Everything compiled together
    - `resources.arsc`: Resources pre-compiled
* All this compilation happens when the app is opened for the first time.
* There's one important file called `R.java` that contains references to where the program can find all the views, resources, etc.

## 1.1 | Views

* A [View](https://developer.android.com/reference/android/view/View.html) is an Object that is the super class of all things drawable in Android
* Some subclasses of Views are: 
    - [TextView](https://developer.android.com/reference/android/widget/TextView.html)
    - [ProgressBar](https://developer.android.com/reference/android/widget/ProgressBar.html)
    - [ImageView](https://developer.android.com/reference/android/widget/ImageView.html)
    - [ViewGroup](https://developer.android.com/reference/android/view/ViewGroup.html)
* Even Layouts are views, they are sub classes of the subclass ViewGroup.

### 1.1.1 | Layouts

* Layouts are ViewGroups, they hold a bunch of view in a nested way.
* You define layouts in XML files, it's easier than the design mode once you get the hang of it
* If you are familiar with AWT or Swing, many of the same layouts you find there you can find in Android.
* Layouts Include:
    - [https://developer.android.com/reference/android/widget/FrameLayout.html](https://developer.android.com/reference/android/widget/FrameLayout.html)
    - [LinearLayout](https://developer.android.com/reference/android/widget/LinearLayout.html)
    - [RelativeLayout](https://developer.android.com/reference/android/widget/RelativeLayout.html)
* Those are just a few of them.

### 1.1.2 | Getting Views in Code

* Views wouldn't be very helpful if we weren't able to manipulate them in code.
* So we need to use `findViewById()` to get the View Object.
* `findViewById()` returns a View object though, we need to cast it to the type we want
* `R.java` gives us access to all the ids

```
gpaTextView = (TextView) findViewById(R.id.gpa_text);
classListView = (ListView) findViewById(R.id.lecture_list);
addClassButton = (Button) findViewById(R.id.create_button);
```

### 1.1.3 | Create a View

* We create a new XML file to create a View to hold each lecture.

## 2.1 | Working with data 

* Now we're going to populate the ListView with some of our data.
* We have data already in the form of the `exampleClassesArray` and `exampleClassesList`.
* We're going to put this into the `classListView` ListView.
* We need to use an ArrayAdapter
    - But first we need a View.

### 2.1.1 

```
ArrayAdapter<String> itemsAdapter = 
    new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);
```

