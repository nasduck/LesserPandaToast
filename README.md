![banner](https://github.com/nasduck/LesserPandaToast/blob/develop/art/%E5%B0%8F%E7%86%8A%E7%8C%ABbanner.png?raw=true)

[![API](https://img.shields.io/badge/LesserPandaToast-v1.0.1-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=14)&ensp;
[![API](https://img.shields.io/badge/API-14%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=14)&ensp;
[![API](https://img.shields.io/badge/License-Apche2.0-brightgreen.svg?style=flat)](https://github.com/nasduck/LesserPandaToast/blob/master/LICENSE)

LesserPandaToast provides the simplest solution to call different types of progresshuds or toasts and dismiss them in an indicated delay. Users could also customize their own styles.

If you are also interested at Dialog. Please take a look at another library [GiantPandaDialog](https://github.com/nasduck/GiantPandaDialog). From these libraries' names, 
you will find they are used together. Please enjoy them :D

## Content

* [Setup](#setup)
* [Usage](#usage)
    * [Tip Toast](#Tip-Toast)
    * [Loading Toast](#Loading-Toast)
* [Contributer](#contributer)
* [License](#license)

## Setup

### **</u>[中文文档](https://github.com/nasduck/LesserPandaToast/blob/master/README-CN.md)</u>**

Adding jitpack repository in your project's `build.gradle` file:

```
allprojects {
	repositories {
		...
		maven { url 'https://www.jitpack.io' }
	}
}
```

Adding the following dependency to app `build.gradle` file:


```
dependencies {
    implementation 'com.github.nasduck:LesserPandaToast:1.0.2'
}
```

## Usage
LesserPandaToast includes two types of Toast：Tip Toast and Loading Toast

### Tip Toast
4 types of Toast are provided by default:

1. Text only
2. Success
3. Failure
4. Warning

#### Show Tip Toast
```java
// Text only
LesserToastBuilder.show(this, "Toast Default");

// Success
LesserToastBuilder.showSuccess(this);                // Image only
LesserToastBuilder.showSuccess(this, "success");     // Image and text

// Failure
LesserToastBuilder.showFailure(this);                // Image only
LesserToastBuilder.showFailure(this, "failure");     // Image and text

// Warning
LesserToastBuilder.showWarning(this);                // Image only
LesserToastBuilder.showWarning(this, "warning");     // Image and text
```

<img src="https://github.com/nasduck/LesserPandaToast/blob/develop/art/text%20toast.png?raw=true" height="300" > <img src="https://github.com/nasduck/LesserPandaToast/blob/develop/art/success%20toast.png?raw=true" height="300" > <img src="https://github.com/nasduck/LesserPandaToast/blob/develop/art/failure%20toast.png?raw=true" height="300" > <img src="https://github.com/nasduck/LesserPandaToast/blob/develop/art/warning%20toast.png?raw=true" height="300" >

#### Dismiss Tip Toast
Tip Toast is designed based on Android native Toast, so there is no need to hide manually and the display time is the same as that of native Toast.

#### Custom Tip Toast
```java
LesserToastBuilder.getInstance(this)
	.setImage(Integer image)                            // set image
        .setAnimation(Integer animation)                    // set image animation
        .setBgColor(Integer bgColor)                        // set background color
        .setCornerRadius(Integer cornerRadius)              // set background corner radius
	.setPaddingTop(Integer paddingTop)                  // set top padding
	.setPaddingBottom(Integer paddingBottom)            // set bottom padding
	.setPaddingLeft(Integer paddingLeft)                // set left padding
	.setPaddingRight(Integer paddingRight)              // set right padding
        .setPaddingHorizontal(Integer paddingHorizontal)    // set horizontal padding
        .setPaddingVertical(Integer paddingVertical)        // set vertical padding
	.setPadding(Integer padding)                        // set padding
        .setText(String text)                               // set text
        .setTextColor(Integer textColor)                    // set text color
        .setTextSize(Integer textSize)                      // set text size
        .setGravity(Integer gravity)                        // set toast location in window
	.setXOffset(Integer xOffset)                        // set the offset in X
	.setYOffset(Integer yOffset)                        // set the offset in Y
	.setDuration(Integer duration)                      // set duration
	.show();
```

### Loading Toast
#### Show Loading Toast
```java
// Loading
DuckToast.showLoading(this);                // Image only
DuckToast.showLoading(this, "loading");     // Image and text
```
 <img src="https://github.com/nasduck/LesserPandaToast/blob/develop/art/loading%20toast.gif?raw=true" height="300" > 

> After `showLoading` is called, Toast will keep shown until user specifies how it will be dismissed. 

#### Dismiss Loading Toast

Two dismiss solution:

1. Dismiss immediately
2. Dismiss with delay

```java
LesserToastBuilder.dismiss();                // Dismiss immediately
LesserToastBuilder.dismiss(long delay);      // Dismiss with delay (ms)
```

#### Custom Loading Toast

Customize Toast:
```java
LesserPandaToast.getInstance(this)
        .setImage(Integer image)                            // set image
        .setAnimation(Integer animation)                    // set iamge animation
        .setBgColor(Integer bgColor)                        // set background color
        .setCornerRadius(Integer cornerRadius)              // set background corner radius
	.setPaddingTop(Integer paddingTop)                  // set top padding
	.setPaddingBottom(Integer paddingBottom)            // set bottom padding
	.setPaddingLeft(Integer paddingLeft)                // set left padding
	.setPaddingRight(Integer paddingRight)              // set right padding
        .setPaddingHorizontal(Integer paddingHorizontal)    // set horizontal padding
        .setPaddingVertical(Integer paddingVertical)        // set vertical padding
	.setPadding(Integer padding)                        // set padding
        .setText(String text)                               // set text
        .setTextColor(Integer textColor)                    // set text color
        .setTextSize(Integer textSize)                      // set text size
        .show();
        
LesserPandaToast.dismiss(1500); 
```

## Contributer

* [Lihao Zhou](https://github.com/redrain39)
* [Chuan DONG](https://github.com/DONGChuan)
* [Si Cheng](1103990937@qq.com)(Art Designer)

## LICENSE
```
   Copyright (2019) Chuan Dong, Lihao Zhou

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
```
