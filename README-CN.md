![banner](https://github.com/nasduck/LesserPandaToast/blob/develop/art/%E5%B0%8F%E7%86%8A%E7%8C%ABbanner.png?raw=true)

[![API](https://img.shields.io/badge/LesserPandaToast-v1.0.1-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=14)&ensp;
[![API](https://img.shields.io/badge/API-14%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=14)&ensp;
[![API](https://img.shields.io/badge/License-Apche2.0-brightgreen.svg?style=flat)](https://github.com/nasduck/LesserPandaToast/blob/master/LICENSE)

LesserPandaToast 提供最简单的方法来调用各类简单的 progressHud 或 loadingToast, 同时提供自定义方法来定义不同的样式. 用户可以手动控制消失或者自动延时消失. 如果你对 Dialog 感兴趣. 欢迎移步另外一个配套的开源项目 [GiantPandaToast](https://github.com/nasduck/GiantPandaDialog). 大熊猫和小熊猫总是搭配使用 :D

## 目录

* [依赖](#依赖)
* [使用方式](#使用方式)
    * [Tip Toast](#Tip-Toast)
    * [Loading Toast](#Loading-Toast)
* [贡献](#贡献)
* [License](#license)


## 依赖

步骤一：在项目的build.gradle中添加jitpack

```
allprojects {
	repositories {
		...
		maven { url 'https://www.jitpack.io' }
	}
}
```

步骤二：添加依赖项


```
dependencies {
    implementation 'com.github.nasduck:LesserPandaToast:1.0.1'
}
```

## 使用方式
LesserPandaToast包含了两类Toast：Tip Toast和Loading Toast

### Tip Toast
默认提供了 4 种 提示性Toast 类型：
1. 纯文字
2. 成功
3. 失败
4. 警告

#### 显示Tip Toast
```java
// 纯文字
LesserPandaToast.show(this, "Toast Default");

// 成功
LesserPandaToast.showSuccess(this);                // 只有图标，不含文字
LesserPandaToast.showSuccess(this, "success");     // 包含图标和文字

// 失败
LesserPandaToast.showFailure(this);                // 只有图标，不含文字
LesserPandaToast.showFailure(this, "failure");     // 包含图标和文字

// 警告
LesserPandaToast.showWarning(this);                // 只有图标，不含文字
LesserPandaToast.showWarning(this, "warning");     // 包含图标和文字
```

#### 隐藏Tip Toast
提示性Toast是基于Android原生的Toast进行设计的，因此不需要手动进行隐藏的操作，显示时长的显示与原生Toast相同。

#### 自定义Tip Toast
```java
LesserToastBuilder.getInstance(this)
	.setImage(Integer image)                            // 设置图片，如未设置, 则图片不显示，图片相关设置也不生效
        .setAnimation(Integer animation)                    // 设置图片的动画
        .setBgColor(Integer bgColor)                        // 设置背景颜色
        .setCornerRadius(Integer cornerRadius)              // 设置背景圆角
	.setPaddingTop(Integer paddingTop)                  // 设置顶部padding
	.setPaddingBottom(Integer paddingBottom)            // 设置底部padding
	.setPaddingLeft(Integer paddingLeft)                // 设置左边padding
	.setPaddingRight(Integer paddingRight)              // 设置右边padding
        .setPaddingHorizontal(Integer paddingHorizontal)    // 设置水平padding
        .setPaddingVertical(Integer paddingVertical)        // 设置竖直padding
	.setPadding(Integer padding)                        // 设置padding
        .setText(String text)                               // 设置文字，如未设置，则文字不显示，文字相关设置不生效
        .setTextColor(Integer textColor)                    // 设置文字颜色
        .setTextSize(Integer textSize)                      // 设置文字大小
        .setGravity(Integer gravity)                        // 设置toast位于屏幕的什么位置
	.setXOffset(Integer xOffset)                        // 设置toast在X轴上的偏移量
	.setYOffset(Integer yOffset)                        // 设置toast在Y轴上的偏移量
	.setDuration(Integer duration)                      // 设置toast显示时长
	.show();
```

<img src="https://github.com/nasduck/LesserPandaToast/blob/develop/art/text%20toast.png?raw=true" height="300" > <img src="https://github.com/nasduck/LesserPandaToast/blob/develop/art/success%20toast.png?raw=true" height="300" > <img src="https://github.com/nasduck/LesserPandaToast/blob/develop/art/failure%20toast.png?raw=true" height="300" > <img src="https://github.com/nasduck/LesserPandaToast/blob/develop/art/warning%20toast.png?raw=true" height="300" > 

### Loading Toast
#### 显示 Loading Toast

```java
// 正在加载
LesserPandaToast.showLoading(this);                // 只有图标，不含文字
LesserPandaToast.showLoading(this, "loading");     // 包含图标和文字
```

<img src="https://github.com/nasduck/LesserPandaToast/blob/develop/art/loading%20toast.gif?raw=true" height="300" > 

> 在用户调用 showXXXX 方法后, Toast 将一直保持显示状态直到用户指定以何种方式消失

### 隐藏 Loading Toast

两种消失方式:

1. 立即消失
2. 延迟一段时间后消失

```java
LesserPandaToast.dismiss();                // 立即消失
LesserPandaToast.dismiss(long delay);      // 延迟 delay 时间后消失(毫秒)
```

### 自定义 Loading Toast
自定义 Toast, 建议进行进一步封装简化调用:

```java
ToastBuilder.getInstance(this)
        .setImage(Integer image)                            // 设置图片，如未设置, 则图片不显示，图片相关设置也不生效
        .setAnimation(Integer animation)                    // 设置图片的动画
        .setBgColor(Integer bgColor)                        // 设置背景颜色
        .setCornerRadius(Integer cornerRadius)              // 设置背景圆角
	.setPaddingTop(Integer paddingTop)                  // 设置顶部padding
	.setPaddingBottom(Integer paddingBottom)            // 设置底部padding
	.setPaddingLeft(Integer paddingLeft)                // 设置左边padding
	.setPaddingRight(Integer paddingRight)              // 设置右边padding
        .setPaddingHorizontal(Integer paddingHorizontal)    // 设置水平padding
        .setPaddingVertical(Integer paddingVertical)        // 设置竖直padding
	.setPadding(Integer padding)                        // 设置padding
        .setText(String text)                               // 设置文字，如未设置，则文字不显示，文字相关设置不生效
        .setTextColor(Integer textColor)                    // 设置文字颜色
        .setTextSize(Integer textSize)                      // 设置文字大小
        .show();
        
ToastBuilder.dismiss(1500); // 1.5 秒后自动消失
```

## 贡献

* [Lihao Zhou](https://github.com/redrain39)
* [Chuan DONG](https://github.com/DONGChuan)
* [Si Cheng](1103990937@qq.com)(设计师)

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
