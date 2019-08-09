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
    * [Show Toast](#show-loadingToast)
    * [Dismiss Toast](#dismiss-loadingToast)
    * [Custom Toast](#custom-loadingToast)
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
    implementation 'com.github.nasduck:LesserPandaToast:1.0.1'
}
```

## Usage

5 types of Toast are provided by default:

1. Text only
2. Success
3. Failure
4. Warning
5. Loading

### Show Toast

```java
// Text only
DuckToast.show(this, "Toast Default");

// Success
DuckToast.showSuccess(this);                // Image only
DuckToast.showSuccess(this, "success");     // Image and text

// Failure
DuckToast.showFailure(this);                // Image only
DuckToast.showFailure(this, "failure");     // Image and text

// Warning
DuckToast.showWarning(this);                // Image only
DuckToast.showWarning(this, "warning");     // Image and text

// Loading
DuckToast.showLoading(this);                // Image only
DuckToast.showLoading(this, "loading");     // Image and text
```

<img src="https://github.com/nasduck/LesserPandaToast/blob/develop/art/text%20toast.png?raw=true" height="300" > <img src="https://github.com/nasduck/LesserPandaToast/blob/develop/art/success%20toast.png?raw=true" height="300" > <img src="https://github.com/nasduck/LesserPandaToast/blob/develop/art/failure%20toast.png?raw=true" height="300" > <img src="https://github.com/nasduck/LesserPandaToast/blob/develop/art/warning%20toast.png?raw=true" height="300" > <img src="https://github.com/nasduck/LesserPandaToast/blob/develop/art/loading%20toast.gif?raw=true" height="300" > 

> After `showXXXX` is called, Toast will keep shown until user specifies how it will be dismissed. 

### Dismiss Toast

Two dismiss solution:

1. Dismiss immediately
2. Dismiss with delay

```java
DuckToast.dismiss();                // Dismiss immediately
DuckToast.dismiss(long delay);      // Dismiss with delay (ms)
```

### Custom Toast

Customize Toast:

```java
ToastBuilder.getInstance(this)
        .setImage(Integer image)                            // Image. If not set, other related image settings won't be enabled
        .setAnimation(Integer animation)                    // Image Animation
        .setBgColor(Integer bgColor)                        // Background color. #B2000000 by default
        .setCornerRadius(Integer cornerRadius)              // Background corner radius. 6dp by default
    	.setPaddingTop(Integer paddingTop)		            // 12dp by default
    	.setPaddingBottom(Integer paddingBottom)	        // 12dp by default
    	.setPaddingLeft(Integer paddingLeft)		        // 24dp by default
    	.setPaddingRight(Integer paddingRight)		        // 24dp by default
        .setPaddingHorizontal(Integer paddingHorizontal)    
        .setPaddingVertical(Integer paddingVertical)
    	.setPadding(Integer padding)
        .setText(String text)                               // Text. If not set, other related text settings won't be enabled
        .setTextColor(Integer textColor)                    // white by default
        .setTextSize(Integer textSize)                      // 14sp by default
        .show();
        
ToastBuilder.dismiss(1500); // dismiss in 1.5s
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
