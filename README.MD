# 📱 Business Card App (Android Kotlin)

## 📌 專案介紹

這是一個使用 Android (Kotlin) 開發的簡單名片 App，
可以顯示個人基本資訊，例如姓名、電話、Email、Instagram 等。

此專案主要練習：

* Android 基本 UI 設計
* 直向 / 橫向畫面切換
* 多語系設定（中 / 英文）
* 圖片與文字排版

---

## 🧑‍💻 作者資訊

* 姓名：Eric
* 電話：0975893473
* Instagram：kao_905
* Email：[kaotzuchi0905@gmail.com](mailto:kaotzuchi0905@gmail.com)

---

## 🛠️ 使用技術

* Kotlin
* Android Studio
* XML Layout（非 Compose）
* ConstraintLayout / LinearLayout
* Drawable 資源管理
* 多語系資源（strings.xml）

---

## 📱 功能說明

### 1️⃣ 直向畫面（Portrait）

* 顯示個人照片
* 顯示姓名、電話、IG、Email
* 排版為上下結構

### 2️⃣ 橫向畫面（Landscape）

* 不顯示照片
* 資訊改為左右排列
* 提升畫面空間利用

### 3️⃣ 多語系切換

* 支援中文 / 英文
* 使用 `values/strings.xml` 與 `values-en/strings.xml`

---

## 📂 專案結構

```
app/
 ├── java/com/example/businesscard/
 │    └── MainActivity.kt
 ├── res/
 │    ├── layout/
 │    │    ├── activity_main.xml
 │    │    └── layout-land/
 │    │         └── activity_main.xml
 │    ├── drawable/
 │    │    └── profile_image.png
 │    ├── values/
 │    │    └── strings.xml
 │    └── values-en/
 │         └── strings.xml
```

---

## ⚙️ 如何執行（Compile & Run）

1. 開啟 Android Studio
2. 點擊 **Open Project**，選擇此專案資料夾
3. 等待 Gradle build 完成
4. 點擊 ▶️ Run
5. 選擇模擬器或實體手機

---

## 🧠 開發過程說明

本專案是從零開始開發，過程中使用以下方式完成：

* 使用 Android 官方教學（Business Card Codelab）
* 遇到問題時查詢文件與網路資源
* 使用 ChatGPT 協助：

    * UI 排版調整
    * 多語系設定方式
    * 橫向 layout 建立
    * Debug 問題（例如畫面錯誤、閃退）

並根據回覆進行修改與測試，最終完成可執行版本。

---

## 🚧 遇到的問題與解決

* ❌ 橫向畫面無法顯示
  → 新增 `layout-land` 資料夾解決

* ❌ App 閃退
  → 檢查資源檔與 id 對應

* ❌ 圖片不顯示
  → 確認 drawable 資料夾與檔名

---

## 📌 未來改進

* 增加點擊功能（例如點電話可撥號）
* 增加深色模式
* UI 優化（卡片式設計）

---

## 📎 GitHub 上傳說明

1. 在專案資料夾執行：

```
git init
git add .
git commit -m "first commit"
```

2. 建立 GitHub repository

3. 連接遠端：

```
git remote add origin 你的repo網址
git branch -M main
git push -u origin main
```

---

## ✅ 備註

此專案為課堂作業，所有功能皆可正常執行。
