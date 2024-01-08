## Spring Framework 6:

Spring 6 Rest MVC

### What is Project Lombok

- Java is often criticized for having too much ceremonial code
- For example, getters and setters
- Project Lombok provides annotations which help eliminate the writing of ceremonial code
- @Getter - generates getters
- @Setter - generates setters
- Using Project Lombok will save you time and give you cleaner code

### Project Lombok History

- Started by Reinier Zwitserloot - @surial on Twitter and Roel Spilker before 2009
- Why “Lombok”? Java is also an island in Indonesia. Lombok is the second island east of the Island Java.
- Lombok is also Indonesian for chilli.
- Hence tag line - “Spicing up your Java

### How Lombok Works

- Hooks in via the Annotation processor API
- The AST (raw source code) is passed to Lombok for code generation before java continues.
- Thus, produces properly compiled Java code in conjunction with the Java compiler
- NOTE: Code is generated and complied. No run-time performance penalty
- If you write an implantation of a method Project Lombok would generate, your code is used
- Make it easy to override Lombok generated code
- Example: custom setters
