toast提供最简单的方法来调用各类简单的toast，同时提供了自定义方法来定义不同的toast样式。

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
    implementation 'com.github.nasduck:DuckAndroidToast:1.0.0'
}
```

## 使用方式
### 调用文字Toast
```java
DuckToast.show(this, "Toast Default");
```
### 调用提示Toast
#### Success
```java
DuckToast.showSuccess(this);                // 只有图标，不含文字
DuckToast.showSuccess(this, "success");     // 包含图标和文字
```
#### Failure
```java
DuckToast.showFailure(this);                // 只有图标，不含文字
DuckToast.showFailure(this, "failure");     // 包含图标和文字
```
#### Warning
```java
DuckToast.showWarning(this);                // 只有图标，不含文字
DuckToast.showWarning(this, "warning");     // 包含图标和文字
```
#### Loading
```java
DuckToast.showLoading(this);                // 只有图标，不含文字
DuckToast.showLoading(this, "loading");     // 包含图标和文字
```

### 隐藏Toast
toast有一个开关的控制，所有的toast调用显示都属于开的过程，而toast的隐藏需要调用方法：
```java
DuckToast.dismiss();                // 使toast立刻消失
DuckToast.dismiss(long delay);      // 使toast在延迟delay的时间后消失
```

### 自定义Toast
在创建自定义toast时，建议进行进一步封装方便调用
```java
ToastBuilder.getInstance(this)
        .setImage(Integer image)                            // 设置图片，如果未设置，则toast中的图片不显示，图片相关设置不生效
        .setAnimation(Integer animation)                    // 设置图片的动画
        .setBgColor(Integer bgColor)                        // 设置背景的颜色
        .setCornerRadius(Integer cornerRadius)              // 设置背景的圆角
        .setPaddingHorizontal(Integer paddingHorizontal)    // 设置水平的padding
        .setPaddingVertical(Integer paddingVertical)        // 设置竖直的padding
        .setText(String text)                               // 设置文字，如果未设置，则toast中的文字不显示，文字相关设置不生效
        .setTextColor(Integer textColor)                    // 设置文字颜色
        .setTextSize(Integer textSize)                      // 设置文字大小
        .show();
ToastBuilder.dismiss(1500);
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
