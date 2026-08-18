<!-- Логотип и навигация -->
<div align="center">
  <img src="assets/logo.svg" alt="Логотип" width="128" height="128">
  <h1>Мой VPN</h1>
  <p>Простой и надёжный VPN-клиент для Android на базе Xray/V2Ray</p>
</div>

<div align="center">
  <a href="#ru"><img src="https://img.shields.io/badge/Русский-🇷🇺-blue?style=flat-square" alt="Русский"></a>
  <a href="#en"><img src="https://img.shields.io/badge/English-🇬🇧-blue?style=flat-square" alt="English"></a>
  <a href="#zh"><img src="https://img.shields.io/badge/中文-🇨🇳-blue?style=flat-square" alt="中文"></a>
  <a href="#de"><img src="https://img.shields.io/badge/Deutsch-🇩🇪-blue?style=flat-square" alt="Deutsch"></a>
  <a href="#uk"><img src="https://img.shields.io/badge/Українська-🇺🇦-blue?style=flat-square" alt="Українська"></a>
</div>

---

<!-- ===================== РУССКИЙ ===================== -->
<h2 id="ru">🇷🇺 Русский</h2>

### Описание

**Мой VPN** — это минималистичный VPN-клиент для Android, построенный на базе ядра Xray/V2Ray. Приложение разработано для простого и надёжного обхода интернет-ограничений. Подходит как для новичков, так и для продвинутых пользователей благодаря интуитивному интерфейсу и гибким настройкам.

Проект основан на открытом коде [v2whitelist (ПроБел)](https://github.com/NullCoreDeveloper/v2whitelist) и распространяется под лицензией **GPL-3.0**.

### Основные возможности

- **Подключение в один клик** — большая кнопка «Старт» на главном экране.
- **Автоматический выбор серверов** — встроенные списки с поддержкой обновления (OTA).
- **Фильтр по странам** — выбор географических локаций для маршрутизации трафика.
- **Импорт конфигураций** — через QR-код, URL или вручную.
- **Поддержка подписок** — управление несколькими источниками серверов.
- **Режим прокси** — работа без VPN-интерфейса (только прокси).
- **Виджет и плитка быстрых настроек** — управление VPN прямо с рабочего стола.
- **Автозапуск после перезагрузки** — опционально.
- **Интеграция с Tasker** — автоматизация сценариев.
- **Полная поддержка Android 7+ (API 24)** и новейших версий.

### Скачивание и установка

**Готовые APK**  
Скачайте последнюю версию APK из раздела [Releases](https://github.com/YOUR_USERNAME/YOUR_REPO/releases) этого репозитория. Выберите подходящую сборку для вашей архитектуры процессора (обычно `arm64-v8a`).

**Сборка из исходников** — см. раздел «Сборка проекта» ниже.

### Сборка проекта

**Требования**:
- Android Studio (последняя версия)
- JDK 17+
- Android SDK (API 33+, NDK 28.2.13676358)
- Git

**Шаги**:
```bash
git clone https://github.com/YOUR_USERNAME/YOUR_REPO.git
cd YOUR_REPO
./gradlew assembleRelease
APK появятся в app/build/outputs/apk/.

Автоматическая сборка через GitHub Actions
При создании тега v* (например, v1.0.0) запускается workflow, который подписывает и выкладывает релиз. Для подписи добавьте секреты:

RELEASE_KEYSTORE (Base64)

RELEASE_KEYSTORE_PASSWORD

RELEASE_KEY_ALIAS

RELEASE_KEY_PASSWORD

Настройка приложения
Разрешите запрашиваемые права.

Нажмите «Старт» — VPN подключится к случайному серверу.

Для выбора страны: Настройки → Фильтр локаций.

Добавьте свой сервер через QR-сканер или вручную (vless://...) в разделе Подписки.

Интеграция с Tasker
Действия:

com.yourcompany.myvpn.action.START — запуск VPN.

com.yourcompany.myvpn.action.STOP — остановка VPN.

Лицензия
GNU General Public License v3.0. Подробнее в файле LICENSE.

Благодарности
v2whitelist

Xray-core

AndroidLibXrayLite

Дисклеймер
Автор не несёт ответственности за использование в странах, где это запрещено.

<!-- ===================== ENGLISH ===================== --><h2 id="en">🇬🇧 English</h2>
Description
My VPN is a minimalist VPN client for Android built on the Xray/V2Ray core. The app is designed for simple and reliable circumvention of internet restrictions. It suits both beginners and advanced users thanks to its intuitive interface and flexible settings.

The project is based on the open‑source v2whitelist (ПроБел) and is distributed under the GPL-3.0 license.

Key Features
One‑click connection — a large «Start» button on the main screen.

Automatic server selection — built‑in lists with OTA updates.

Country filter — choose geographic locations for traffic routing.

Import configurations — via QR code, URL, or manually.

Subscription support — manage multiple server sources.

Proxy mode — work without a VPN interface (proxy only).

Widget and Quick Settings tile — control VPN right from the home screen.

Auto‑start after reboot — optional.

Tasker integration — automation scenarios.

Full support for Android 7+ (API 24) and newer.

Download and Installation
Ready APKs – download from Releases. Choose the build for your architecture (usually arm64-v8a).

Building from source – see «Building the Project» below.

Building the Project
Requirements:

Android Studio (latest)

JDK 17+

Android SDK (API 33+, NDK 28.2.13676358)

Git

Steps:

bash
git clone https://github.com/YOUR_USERNAME/YOUR_REPO.git
cd YOUR_REPO
./gradlew assembleRelease
APKs will be in app/build/outputs/apk/.

Automatic build via GitHub Actions – on tag v*, the workflow signs and creates a release. Add secrets:

RELEASE_KEYSTORE (Base64)

RELEASE_KEYSTORE_PASSWORD

RELEASE_KEY_ALIAS

RELEASE_KEY_PASSWORD

App Configuration
Grant permissions.

Tap «Start» – VPN connects to a random server.

To select a country: Settings → Location Filter.

Add your own server via QR scanner or manually (vless://...) in Subscriptions.

Tasker Integration
Actions:

com.yourcompany.myvpn.action.START – start VPN.

com.yourcompany.myvpn.action.STOP – stop VPN.

License
GNU General Public License v3.0. See LICENSE.

Acknowledgments
v2whitelist

Xray-core

AndroidLibXrayLite

Disclaimer
The author is not responsible for usage in countries where prohibited.

<!-- ===================== 中文 ===================== --><h2 id="zh">🇨🇳 中文</h2>
描述
我的 VPN 是一款基于 Xray/V2Ray 核心的极简 Android VPN 客户端。该应用旨在简单可靠地绕过互联网限制。它直观的界面和灵活的设置使其既适合新手也适合高级用户。

该项目基于开源项目 v2whitelist (ПроБел)，并根据 GPL-3.0 许可证分发。

主要功能
一键连接 — 主屏幕上的大“启动”按钮。

自动选择服务器 — 内置列表，支持 OTA 更新。

国家/地区过滤 — 选择地理位置以进行流量路由。

导入配置 — 通过 QR 码、URL 或手动输入。

订阅支持 — 管理多个服务器源。

代理模式 — 无需 VPN 接口（仅代理）。

小部件和快速设置磁贴 — 直接从主屏幕控制 VPN。

重启后自动启动 — 可选。

Tasker 集成 — 自动化场景。

完全支持 Android 7+ (API 24) 及更新版本。

下载和安装
准备好的 APK – 从 Releases 下载。选择适合您处理器架构的版本（通常为 arm64-v8a）。

从源代码构建 – 见下方「构建项目」。

构建项目
要求：

Android Studio（最新版）

JDK 17+

Android SDK（API 33+, NDK 28.2.13676358）

Git

步骤：

bash
git clone https://github.com/YOUR_USERNAME/YOUR_REPO.git
cd YOUR_REPO
./gradlew assembleRelease
APK 位于 app/build/outputs/apk/。

通过 GitHub Actions 自动构建 – 推送标签 v* 时自动构建、签名并发布。添加 secrets：

RELEASE_KEYSTORE (Base64)

RELEASE_KEYSTORE_PASSWORD

RELEASE_KEY_ALIAS

RELEASE_KEY_PASSWORD

应用配置
授予权限。

点击“启动” – VPN 连接随机服务器。

选择国家：设置 → 位置过滤。

添加自己的服务器：通过 QR 扫描仪或手动输入（vless://...）在 订阅 中。

Tasker 集成
操作：

com.yourcompany.myvpn.action.START – 启动 VPN。

com.yourcompany.myvpn.action.STOP – 停止 VPN。

许可证
GNU General Public License v3.0。见 LICENSE 文件。

致谢
v2whitelist

Xray-core

AndroidLibXrayLite

免责声明
作者对在禁止使用此类应用的国家/地区使用该应用不承担任何责任。

<!-- ===================== DEUTSCH ===================== --><h2 id="de">🇩🇪 Deutsch</h2>
Beschreibung
Mein VPN ist ein minimalistischer VPN-Client für Android, der auf dem Xray/V2Ray‑Kern basiert. Die App wurde für die einfache und zuverlässige Umgehung von Internetsperren entwickelt. Sie eignet sich sowohl für Anfänger als auch für fortgeschrittene Benutzer dank der intuitiven Oberfläche und flexiblen Einstellungen.

Das Projekt basiert auf dem Open‑Source‑Projekt v2whitelist (ПроБел) und wird unter der GPL-3.0‑Lizenz vertrieben.

Hauptfunktionen
Ein‑Klick‑Verbindung – großer „Start“‑Button auf dem Hauptbildschirm.

Automatische Serverauswahl – integrierte Listen mit OTA‑Updates.

Länderfilter – Auswahl geografischer Standorte für das Routing.

Konfigurationsimport – per QR‑Code, URL oder manuell.

Unterstützung von Abonnements – Verwaltung mehrerer Serverquellen.

Proxy‑Modus – Arbeit ohne VPN‑Schnittstelle (nur Proxy).

Widget und Schnelleinstellungen‑Kachel – Steuerung direkt vom Startbildschirm.

Autostart nach Neustart – optional.

Tasker‑Integration – Automatisierungsszenarien.

Vollständige Unterstützung für Android 7+ (API 24) und neuere Versionen.

Download und Installation
Fertige APKs – laden Sie die neueste Version aus dem Releases‑Bereich herunter. Wählen Sie den Build für Ihre Prozessorarchitektur (normalerweise arm64-v8a).

Build aus dem Quellcode – siehe unten „Projekt bauen“.

Projekt bauen
Anforderungen:

Android Studio (aktuellste Version)

JDK 17+

Android SDK (API 33+, NDK 28.2.13676358)

Git

Schritte:

bash
git clone https://github.com/YOUR_USERNAME/YOUR_REPO.git
cd YOUR_REPO
./gradlew assembleRelease
APKs finden Sie in app/build/outputs/apk/.

Automatischer Build über GitHub Actions – bei Tag v* wird der Workflow gestartet, signiert und ein Release erstellt. Fügen Sie Secrets hinzu:

RELEASE_KEYSTORE (Base64)

RELEASE_KEYSTORE_PASSWORD

RELEASE_KEY_ALIAS

RELEASE_KEY_PASSWORD

App‑Konfiguration
Erteilen Sie die erforderlichen Berechtigungen.

Tippen Sie auf „Start“ – VPN verbindet sich mit einem zufälligen Server.

Um ein Land auszuwählen: Einstellungen → Standortfilter.

Fügen Sie Ihren eigenen Server über den QR‑Scanner oder manuell (vless://...) im Bereich Abonnements hinzu.

Tasker‑Integration
Aktionen:

com.yourcompany.myvpn.action.START – VPN starten.

com.yourcompany.myvpn.action.STOP – VPN stoppen.

Lizenz
GNU General Public License v3.0. Siehe LICENSE.

Danksagungen
v2whitelist

Xray-core

AndroidLibXrayLite

Haftungsausschluss
Der Autor übernimmt keine Verantwortung für die Nutzung in Ländern, in denen dies gesetzlich verboten ist.

<!-- ===================== УКРАЇНСЬКА ===================== --><h2 id="uk">🇺🇦 Українська</h2>
Опис
Мій VPN — це мінімалістичний VPN-клієнт для Android, побудований на основі ядра Xray/V2Ray. Додаток розроблений для простого та надійного обходу інтернет-обмежень. Підходить як для новачків, так і для досвідчених користувачів завдяки інтуїтивному інтерфейсу та гнучким налаштуванням.

Проєкт заснований на відкритому коді v2whitelist (ПроБел) і поширюється під ліцензією GPL-3.0.

Основні можливости
Підключення в один клік — велика кнопка «Старт» на головному екрані.

Автоматичний вибір серверів — вбудовані списки з підтримкою оновлення (OTA).

Фільтр за країнами — вибір географічних локацій для маршрутизації трафіку.

Імпорт конфігурацій — через QR-код, URL або вручну.

Підтримка підписок — керування декількома джерелами серверів.

Режим проксі — робота без VPN-інтерфейсу (тільки проксі).

Віджет і плитка швидких налаштувань — керування VPN прямо з робочого столу.

Автозапуск після перезавантаження — опціонально.

Інтеграція з Tasker — автоматизація сценаріїв.

Повна підтримка Android 7+ (API 24) і новіших версій.

Завантаження та встановлення
Готові APK — завантажте останню версію APK з розділу Releases. Виберіть збірку, що підходить для вашої архітектури процесора (зазвичай arm64-v8a).

Збірка з вихідників — див. розділ «Збірка проєкту» нижче.

Збірка проєкту
Вимоги:

Android Studio (остання версія)

JDK 17+

Android SDK (API 33+, NDK 28.2.13676358)

Git

Кроки:

bash
git clone https://github.com/YOUR_USERNAME/YOUR_REPO.git
cd YOUR_REPO
./gradlew assembleRelease
APK з'являться в app/build/outputs/apk/.

Автоматична збірка через GitHub Actions – при створенні тега v* запускається workflow, який підписує та викладає реліз. Для підпису додайте секрети:

RELEASE_KEYSTORE (Base64)

RELEASE_KEYSTORE_PASSWORD

RELEASE_KEY_ALIAS

RELEASE_KEY_PASSWORD

Налаштування додатку
Надайте дозволи.

Натисніть «Старт» — VPN підключиться до випадкового сервера.

Для вибору країни: Налаштування → Фільтр локацій.

Додайте власний сервер через QR-сканер або вручну (vless://...) у розділі Підписки.

Інтеграція з Tasker
Дії:

com.yourcompany.myvpn.action.START — запуск VPN.

com.yourcompany.myvpn.action.STOP — зупинка VPN.

Ліцензія
GNU General Public License v3.0. Докладніше у файлі LICENSE.

Подяки
v2whitelist

Xray-core

AndroidLibXrayLite

Дисклеймер
Автор не несе відповідальності за використання в країнах, де це заборонено законом.

↑ Наверх / Back to top

text

---

## Логотип (файл `assets/logo.svg`)

Создайте в корне репозитория папку `assets` и поместите туда этот файл:

```svg
<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 100 100">
  <rect x="10" y="10" width="80" height="80" rx="20" fill="#2E7D32" />
  <path d="M30 40 L45 60 L70 30" stroke="white" stroke-width="8" fill="none" stroke-linecap="round" stroke-linejoin="round" />
  <circle cx="30" cy="70" r="6" fill="white" />
  <circle cx="70" cy="70" r="6" fill="white" />
</svg>
