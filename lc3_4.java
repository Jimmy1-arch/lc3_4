// -------------------res/menu/main_menu.xml-------------------

```xml
<?xml version="1.0" encoding="utf-8"?>
<menu xmlns:android="http://schemas.android.com/apk/res/android">

    <item
        android:id="@+id/menu_home"
        android:title="Home" />

    <item
        android:id="@+id/menu_student"
        android:title="Student Details" />

    <item
        android:id="@+id/menu_about"
        android:title="About" />

</menu>
```
// -------------------res/layout/activity_main.xml-------------------

```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:gravity="center">

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="HOME"
        android:textSize="30sp"
        android:textStyle="bold" />

</LinearLayout>
```
```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:gravity="center">

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="HOME"
        android:textSize="30sp"
        android:textStyle="bold" />

</LinearLayout>
```
```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:gravity="center">

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="HOME"
        android:textSize="30sp"
        android:textStyle="bold" />

</LinearLayout>
```
// -------------------MainActivity.java-------------------

```java
package com.example.mainmenu;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.menu_home) {
            Intent intent = new Intent(
                MainActivity.this,
                MainActivity.class
            );
            startActivity(intent);
            return true;

        } else if (id == R.id.menu_student) {
            Intent intent = new Intent(
                MainActivity.this,
                StudentDetailsActivity.class
            );
            startActivity(intent);
            return true;

        } else if (id == R.id.menu_about) {
            Intent intent = new Intent(
                MainActivity.this,
                AboutActivity.class
            );
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
```
// -------------------res/layout/activity_about.xml-------------------

```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:gravity="center">

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="About"
        android:textSize="22sp"
        android:textStyle="bold" />

</LinearLayout>
```
// A-------------------AboutActivity.java-------------------

```java
package com.example.optionsmenuapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
    }
}
```
// -------------------res/layout/activity_student_details.xml-------------------

```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:gravity="center">

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Student Details"
        android:textSize="28sp"
        android:textStyle="bold" />

</LinearLayout>
```
// -------------------StudentDetailsActivity.java-------------------

```java
package com.example.mainmenu;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class StudentDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_details);
    }
}
```
// -------------------AndroidManifest.xml-------------------

```xml
<?xml version="1.0" encoding="utf-8"?>
<manifest
    xmlns:android="http://schemas.android.com/apk/res/android">

    <application
        android:allowBackup="true"
        android:label="Main Menu"
        android:supportsRtl="true"
        android:theme="@style/Theme.MainMenu">

        <activity
            android:name=".AboutActivity"
            android:exported="false" />

        <activity
            android:name=".StudentDetailsActivity"
            android:exported="false" />

        <activity
            android:name=".MainActivity"
            android:exported="true">

            <intent-filter>
                <action android:name="android.intent.action.MAIN" />
                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>

        </activity>

    </application>
</manifest>
```

