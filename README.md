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
