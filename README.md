# ReelsEditor - Aplikacion Android për krijimin e Reels me Dizajn Automatik

Aplikacion i plotë Android për krijimin dhe editimin e Reels/Shorts me funksionalitete të avancuara të dizajnit automatik.

## Veçoritë Kryesore

### 🎬 Template Designer Automatik
- **8 Templates unikë**: Modern, News, Viral, Minimal, Dynamic, Cinematic, Retro, Gradient
- **Gjenerim i paletës së ngjyrave** nga imazhet e ngarkuara (foto lajmi, video, reklamë)
- **Animime titullsh**: Typewriter, Scale Bounce, Glitch Reveal, Particle Formation, Liquid Morph, Neon Flicker
- **Tranzicione**: Smooth, Zoom & Pan, Glitch Cut, Morph, Liquid, Cube Rotate
- **Efekte tekshi**: Glow, Neon, Gradient Fill, Animated Rainbow, Glitch, Outline, Shadow

### 📹 Elementët e Reel-it
- **Titull i lajmit** me animime personalizueshme
- **Foto e lajmit** me pozicionim dhe efekte automatikë
- **Reklamë paraprake (Pre-roll)** me konfigurim kohës skip dhe buton skip
- **Video kryesore** me color grading bazuar në template
- **Muzikë e fonsit** (për zgjatje të ardhshme)

### 💾 Ruajtje dhe Eksport
- **Room Database** për ruajtjen e projekteve (draft/eksportuar)
- **Eksport në background** me Foreground Service
- **Cilësi të shumta**: 1080p, 720p, 480p
- **Shpërndarje direkt** në TikTok, Instagram Reels, YouTube Shorts

## Teknologjitë e Përdorura

- **Kotlin 2.0** + **Jetpack Compose** (Modern UI)
- **Hilt** (Dependency Injection)
- **Room** (Database)
- **Media3 Transformer** (Video processing)
- **Coil** (Image loading)
- **Kotlinx Serialization** (JSON)
- **Coroutines & Flow** (Async)

## Struktura e Projektit

```
ReelsEditor/
├── app/
│   ├── src/main/
│   │   ├── java/com/reelseditor/
│   │   │   ├── model/          # Data models (Reel, Ad, DesignConfig, Templates)
│   │   │   ├── engine/         # TemplateDesignerEngine, VideoProcessingEngine
│   │   │   ├── repository/     # Room DAOs, Repository, Database
│   │   │   ├── ui/
│   │   │   │   ├── screen/     # MainActivity, EditorActivity, PreviewActivity
│   │   │   │   ├── component/  # Reusable Compose components
│   │   │   │   └── theme/      # Material3 Theme, Typography, Shapes
│   │   │   └── util/           # Converters, ExportCallback, ImagePaletteExtractor
│   │   ├── res/                # Resources (colors, strings, drawables, xml)
│   │   └── AndroidManifest.xml
│   └── build.gradle.kts
├── build.gradle.kts
├── settings.gradle.kts
└── gradle.properties
```

## Instalimi dhe Ndërtimi

### Kërkesat
- Android Studio Koala (2024.1.1) ose më i ri
- JDK 17+
- Android SDK 34

### Ndërtimi

```bash
# Në Windows
build.bat

# Ose manualisht
./gradlew assembleDebug
```

APK-i do të gjendet në: `app/build/outputs/apk/debug/app-debug.apk`

## Përdorimi

1. **Hap aplikacionin** - Do të shihesh ekranin kryesor me listën e projekteve
2. **Kliko "Krijo Reel të Ri"** - Hapet Template Picker
3. **Zgjidh një template** - 8 opsione me preview të jetë
4. **Plotëso fushat**:
   - Shkruaj titullin e lajmit
   - Zgjidh foton e lajmit nga galeria
   - Zgjidh videon kryesore
   - (Opsionale) Zgjidh reklamën paraprake
5. **Kliko "Gjenero Dizajn Automatik"** - AI do të krijojë dizajnin unik
6. **Paraqitje** - Kliko ikonën e syrit për të parë preview
7. **Eksporto** - Kliko "Eksporto Reel" për të ruajtur në galeri

## Templates Disponues

| Template | Përshkrimi | Përdorim Ideal |
|----------|------------|----------------|
| **Modern** | Dizajn i pastruar me gradient mesh | Përgjithshme, lifestyle |
| **News** | Stil gazetari, breaking news | Lajme, aktualitet |
| **Viral** | Ngjyra të rralla, efekte të shpejta | Trend, challenges |
| **Minimal** | Thjeshtë, elegjant, fokus në përmbajtje | Professional, corporate |
| **Dynamic** | Tranzicione komplekse, layer-e shumëfishta | Action, sports |
| **Cinematic** | Letterbox, color grading, film look | Storytelling, travel |
| **Retro** | VHS, glitch, estetikë 90s/00s | Nostalgia, throwback |
| **Gradient** | Meshnjëra ngjyrash me mesh dhe blur | Artistic, creative |

## Konfigurimi i Reklamës Paraprake (Pre-roll)

Reklama paraprake mund të konfigurohet me:
- **Kohëzgjatja maksimale**: 15 sekonda
- **Buton Skip**: Paraqitet pas 5 sekondash (personalizueshëm)
- **Mute by default**: Opsion për të filluar pa zë
- **Overlay "SPONSORED"**: Automatikisht shtohet mbi reklamë

## Lisencë

MIT License - Shih `LICENSE` për detaje.

## Kontribucion

Pull requests janë të mirëpritur! Për ndryshime të mëdha, hapni një issue për të diskutuar ato fillimisht.

---

**Zhvilluar me ❤️ për kreatorët e përmbajtjeve shqiptarë**