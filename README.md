# Projeto - Selenium, Java & Cucumber

## Ferramentas utilizadas:
- [Maven](https://maven.apache.org/ "Maven")
- [Java](https://www.java.com/pt_BR/ "Java")
- [JUnit](https://junit.org/junit4/ "JUnit")
- [Selenium](https://www.seleniumhq.org/ "Selenium")
- [ChromeDriver](https://chromedriver.chromium.org/downloads "ChromeDriver")
- [Cucumber](https://cucumber.io/ "Cucumber")

## Arquitetura:
```
├── README.md
├── pom.xml
└── src
    ├── main
    │   ├── java
    │   └── resources
    └── test
        ├── java
        │   ├── core
        │   │   └──  Driver   
        │   ├── maps
        │   │   └── LoginMaps
        │   ├── pages
        │   │   └──  LoginPage
        │   ├── runner
        │   │   └──  RunnerTest
        │   ├── steps
        │   │   └──  Login.Steps
        │   │       
        └── resources
            ├── drivers
            │   └── READ.txt
            └── features
                └── login.feature
```

Neste projeto foram utilizadas 4 bibliotecas:
- [selenium-java](https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java "selenium-java")
- [junit](https://mvnrepository.com/artifact/junit/junit "junit")
- [cucumber-java](https://mvnrepository.com/artifact/info.cukes/cucumber-java "cucumber-java")
- [cucumber-junit](https://mvnrepository.com/artifact/info.cukes/cucumber-junit "cucumber-junit")

## Contruibuidores:

Obrigada, Adam Vinicius e Samuel Lucas.
