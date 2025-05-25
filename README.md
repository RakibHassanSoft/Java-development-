<img src="https://braceinfotech.com/assets/uploads/knowledge/java.jpg" alt="Java" style="width:100%; height:auto;" />
****

# ✅Java সংক্ষিপ্ত পরিচিতি (Java Introduction in Bangla)

## ভূমিকা
Java একটি উচ্চ-স্তরের, অবজেক্ট ওরিয়েন্টেড, এবং প্ল্যাটফর্ম স্বাধীন প্রোগ্রামিং ভাষা।
এটি ১৯৯৫ সালে Sun Microsystems কর্তৃক প্রকাশিত হয়, যার প্রধান স্থপতি ছিলেন James Gosling।
বর্তমানে Java এর মালিকানা রয়েছে Oracle Corporation এর অধীনে।

## বৈশিষ্ট্যসমূহ (Features of Java)
- **Simple**: Java এর সিনট্যাক্স অনেকটাই C/C++ এর মত হলেও এটি অনেক সহজ এবং জটিল অংশগুলো বাদ দেওয়া হয়েছে।
- **Object-Oriented**: Java সম্পূর্ণরূপে অবজেক্ট ওরিয়েন্টেড, যেখানে সবকিছুই ক্লাস এবং অবজেক্ট দ্বারা পরিচালিত।
- **Platform-Independent**: Java কোড একবার লিখে যেকোনো প্ল্যাটফর্মে চালানো যায় (Write Once, Run Anywhere)।
- **Secure**: Java উন্নত সিকিউরিটি ফিচার দ্বারা সিস্টেমকে নিরাপদ রাখে।
- **Robust**: এটি স্ট্রং টাইপ চেকিং এবং এক্সসেপশন হ্যান্ডলিং এর মাধ্যমে নির্ভরযোগ্য সফটওয়্যার তৈরিতে সহায়তা করে।
- **Multithreaded**: Java একাধিক কাজ একসাথে সম্পাদন করতে পারে।
- **High Performance**: JIT (Just-In-Time) কম্পাইলারের কারণে Java অনেক কার্যকরী পারফরম্যান্স প্রদান করে।

## ব্যবহারের ক্ষেত্র (Where Java is Used)
- অ্যান্ড্রয়েড অ্যাপ ডেভেলপমেন্ট
- ওয়েব অ্যাপ্লিকেশন
- ডেস্কটপ সফটওয়্যার
- ক্লাউড-ভিত্তিক সফটওয়্যার
- এন্টারপ্রাইজ লেভেলের অ্যাপ্লিকেশন
- বড় ধরনের ডেটা ও আর্টিফিশিয়াল ইন্টেলিজেন্স প্রজেক্ট

## একটি সাধারণ Java কোড উদাহরণ

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("স্বাগতম জাভা বিশ্বে!");
    }
}
```

## উপসংহার
Java একটি শক্তিশালী ও বহুল ব্যবহৃত প্রোগ্রামিং ভাষা।
এটি প্রোগ্রামিং শেখার জন্য আদর্শ এবং ভবিষ্যতের জন্য অ্যাপ, ওয়েবসাইট, এবং সফটওয়্যার ডেভেলপমেন্টের জন্য দরজা খুলে দেয়।







# ✅Java গঠন ও রান করার পদ্ধতি (Structure of Java & How it Runs)

## ১. Java প্রোগ্রামের গঠন (Structure of a Java Program)

একটি সাধারণ Java প্রোগ্রামের গঠন নিম্নরূপ:

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

### ব্যাখ্যা:
- `public class HelloWorld` → এটি একটি ক্লাস, যার নাম অবশ্যই ফাইলের নামের সাথে মিলে যেতে হবে (HelloWorld.java)।
- `public static void main(String[] args)` → এটি Java প্রোগ্রামের entry point, অর্থাৎ এখান থেকেই প্রোগ্রাম শুরু হয়।
- `System.out.println(...)` → এটি কনসোলে আউটপুট প্রিন্ট করার জন্য ব্যবহৃত হয়।

## ২. Java প্রোগ্রাম কীভাবে রান করে? (How Java Code Runs)

Java এর কোড রান করার জন্য নিচের ধাপগুলো অনুসরণ করা হয়:

### ১. লেখার ধাপ:
আপনি `.java` এক্সটেনশন সহ সোর্স কোড লেখেন (যেমন `HelloWorld.java`)।

### ২. কম্পাইলেশন ধাপ:
Java Compiler (`javac`) ব্যবহার করে সোর্স কোডকে **Bytecode** এ রূপান্তর করা হয়।
কম্পাইল করার পরে একটি `.class` ফাইল তৈরি হয় (যেমন `HelloWorld.class`)।

### ৩. এক্সিকিউশন ধাপ:
Bytecode ফাইলটি JVM (Java Virtual Machine) দ্বারা চালানো হয়।
JVM নির্দিষ্ট প্ল্যাটফর্ম অনুযায়ী Bytecode ইন্টারপ্রেট করে এবং প্রোগ্রাম রান করে।

### সংক্ষেপে ধাপগুলো:
১. Write: `HelloWorld.java`  
২. Compile: `javac HelloWorld.java` → আউটপুট: `HelloWorld.class`  
৩. Run: `java HelloWorld`

## ৩. Java Execution Flow চিত্র

```
+-----------------+
| .java File      |
+-----------------+
        |
        v
+-----------------+
| javac Compiler  |
+-----------------+
        |
        v
+-----------------+
| .class Bytecode |
+-----------------+
        |
        v
+----------------------+
| JVM (Java Virtual Machine) |
+----------------------+
        |
        v
+------------------+
| Program Runs     |
+------------------+
```

## ৪. JVM, JRE এবং JDK এর পার্থক্য

- **JVM (Java Virtual Machine):** এটি Bytecode রান করে।
- **JRE (Java Runtime Environment):** JVM + প্রয়োজনীয় লাইব্রেরি এবং ফাইল যাতে Java প্রোগ্রাম রান করতে পারে।
- **JDK (Java Development Kit):** JRE + ডেভেলপমেন্ট টুলস (যেমন `javac`, `javadoc`) যা Java অ্যাপ তৈরি করতে ব্যবহৃত হয়।

## উপসংহার

Java প্রোগ্রামের মূল চালনা প্রক্রিয়া হলো - কোড লেখা → কম্পাইল করা → JVM এর মাধ্যমে রান করা।
এই স্ট্রাকচার এবং প্রসেস Java কে একটি শক্তিশালী, প্ল্যাটফর্ম ইন্ডিপেন্ডেন্ট এবং নিরাপদ ভাষা হিসেবে গড়ে তুলেছে।




# ✅Java ডেটা টাইপস (Data Types in Java)

Java একটি স্ট্যাটিকালি টাইপড ভাষা, অর্থাৎ প্রতিটি ভেরিয়েবলের টাইপ কম্পাইল টাইমে নির্ধারণ করতে হয়।
Java-তে দুই ধরনের ডেটা টাইপ আছে:

## ১. Primitive Data Types
এগুলো Java-র built-in ডেটা টাইপস। মোট ৮টি:

### ১.1 Numeric Types

#### ১.1.1 Integer Types:
- **byte**: 1 byte → -128 থেকে 127 পর্যন্ত মান সংরক্ষণ করে।
- **short**: 2 bytes → -32,768 থেকে 32,767 পর্যন্ত।
- **int**: 4 bytes → -2,147,483,648 থেকে 2,147,483,647 পর্যন্ত। (default integer type)
- **long**: 8 bytes → বিশাল সংখ্যার জন্য ব্যবহৃত হয়। শেষেই `L` ব্যবহার করতে হয় (যেমন: `123456789L`)

#### ১.1.2 Floating Point Types:
- **float**: 4 bytes → দশমিক সংখ্যার জন্য। `f` suffix প্রয়োজন (যেমন: `3.14f`)
- **double**: 8 bytes → ডিফল্ট দশমিক টাইপ, float থেকে বেশি precision রাখে।

### ১.2 Character Type
- **char**: 2 bytes → একটি ইউনিকোড ক্যারেক্টার সংরক্ষণ করে (যেমন: `'A'`, `'%'`, `'১'`)

### ১.3 Boolean Type
- **boolean**: 1 bit → `true` বা `false` স্টোর করে।

## ২. Non-Primitive (Reference) Data Types
এগুলো অবজেক্ট টাইপ ডেটা, যেমন:
- **String** → টেক্সট সংরক্ষণের জন্য ব্যবহার হয়
- **Arrays** → একই টাইপের একাধিক ভ্যালু সংরক্ষণে ব্যবহৃত হয়
- **Classes** → কাস্টম অবজেক্ট তৈরি করার জন্য
- **Interfaces, Enums** ইত্যাদি

## উদাহরণ (Examples of Data Types in Java)

```java
public class DataTypesExample {
    public static void main(String[] args) {
       // DataType Variable = value
        byte age = 23;
        short year = 2024;
        int salary = 50000;
        long population = 7800000000L;
        float temperature = 36.6f;
        double pi = 3.1415926535;
        char grade = 'A';
        boolean isPassed = true;
        String name = "Rakib";

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Year: " + year);
        System.out.println("Salary: " + salary);
        System.out.println("Population: " + population);
        System.out.println("Temperature: " + temperature);
        System.out.println("PI: " + pi);
        System.out.println("Grade: " + grade);
        System.out.println("Passed: " + isPassed);
    }
}
```

## Data Types Summary Table

| Type     | Size      | Range / Use                        |
|----------|-----------|------------------------------------|
| byte     | 1 byte    | -128 to 127                        |
| short    | 2 bytes   | -32,768 to 32,767                  |
| int      | 4 bytes   | -2B to +2B (default for integers)  |
| long     | 8 bytes   | Very large integers                |
| float    | 4 bytes   | Decimal values, less precision     |
| double   | 8 bytes   | More precision (default for float) |
| char     | 2 bytes   | Single character                   |
| boolean  | 1 bit     | true or false                      |
| String   | Varies    | Sequence of characters (text)      |

## উপসংহার
Java-র ডেটা টাইপগুলো প্রোগ্রামের সঠিক এবং দক্ষ কাজের জন্য অপরিহার্য।
প্রতিটি টাইপের নির্দিষ্ট ব্যবহার ক্ষেত্র রয়েছে, তাই টাইপ নির্বাচনে সচেতন হওয়া জরুরি।



# ✅Java: Scanner এবং Variable Declaration বিস্তারিত

Java-তে ইনপুট নিতে হলে `Scanner` ক্লাস ব্যবহার করতে হয়, এবং প্রতিটি ভেরিয়েবল ব্যবহার করার আগে সেটিকে ডিক্লেয়ার করতে হয়।

-----------------------------
## ✏️ Variable Declaration কী?
-----------------------------
Variable Declaration বলতে বোঝায়:
- কোন নাম দিয়ে ভেরিয়েবল তৈরি করা হচ্ছে
- সেটি কী ধরনের (data type)
- এবং চাইলে শুরুতেই মান অ্যাসাইন করা

উদাহরণ:
```java
int number;           // শুধু Declear করা হলো
int age = 23;         // Declear + মান অ্যাসাইন
String name = "Rakib";
```

✅ সবসময়: `dataType variableName = value;` এই ফর্মুলা ব্যবহার করা হয়।

-----------------------------
## 📥 Scanner দিয়ে ইনপুট নেওয়া
-----------------------------
Java-তে ইনপুট নেওয়ার জন্য `java.util.Scanner` ক্লাস ব্যবহার করতে হয়।

### ধাপ ১: import করতে হবে
```java
import java.util.Scanner;
```

### ধাপ ২: Scanner অবজেক্ট তৈরি
```java
Scanner sc = new Scanner(System.in);
```

`System.in` হলো standard input (keyboard), এবং `sc` একটি অবজেক্ট যার মাধ্যমে ইনপুট নেওয়া যাবে।

### উদাহরণ ইনপুট নেওয়ার:
```java
System.out.print("Enter your name: ");
String name = sc.nextLine();

System.out.print("Enter your age: ");
int age = sc.nextInt();
```

-----------------------------
## 🧪 পূর্ণ উদাহরণ: Scanner + Declaration + যোগফল
-----------------------------

```java
import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        // Scanner অবজেক্ট তৈরি
        Scanner sc = new Scanner(System.in);

        // ইউজার থেকে সংখ্যা ইনপুট নেওয়া
        System.out.print("কত পর্যন্ত সংখ্যা যোগ করতে চান?: ");
        int n = sc.nextInt();

        // sum এবং i ভেরিয়েবল ডিক্লেয়ার করা
        int sum = 0;
        int i = 1;

        // do-while loop দিয়ে যোগফল বের করা
        do {
            sum += i;
            i++;
        } while(i <= n);

        // ফলাফল প্রদর্শন
        System.out.println("১ থেকে " + n + " পর্যন্ত যোগফল: " + sum);
    }
}
```

-----------------------------
## 🔚 উপসংহার
-----------------------------
✅ ভেরিয়েবল ঘোষণা করা হয় → `dataType variableName = value;`
✅ ইনপুট নেওয়ার জন্য → `Scanner` ক্লাস ব্যবহার করা হয়
✅ `Scanner` ব্যবহার করতে হয় → `import java.util.Scanner;`
✅ ইনপুটের ধরন অনুযায়ী:
- `sc.nextInt()` → সংখ্যার জন্য
- `sc.nextLine()` → পুরো লাইনের জন্য
- `sc.next()` → একটি শব্দ ইনপুটের জন্য




# ✅DSA (Data Structures and Algorithms) এর ধরনসমূহ

DSA হলো প্রোগ্রামিং এর গুরুত্বপূর্ণ অংশ, যা ডেটা সঞ্চয় ও পরিচালনা এবং সমস্যা সমাধানের জন্য ব্যবহৃত হয়।

## ১. Data Structures (ডেটা স্ট্রাকচার)

ডেটাকে সঠিক ভাবে সঞ্চয় ও সংগঠিত করার নিয়ম বা পদ্ধতি।

প্রধান Data Structures গুলো:

- **Array (অ্যারে):**
  ধারাবাহিক মেমোরিতে একই ধরনের ডেটার সংগ্রহ। 
  দ্রুত index দিয়ে অ্যাক্সেস করতে পারি।

- **Linked List (লিঙ্কড লিস্ট):**
  নোডের সিরিজ যেখানে প্রতিটি নোডের মধ্যে পরের নোডের ঠিকানা থাকে।
  ইনসার্ট ও ডিলিট সহজ, কিন্তু অ্যাক্সেস ধীর।

- **Stack (স্ট্যাক):**
  Last In First Out (LIFO) ডেটা স্ট্রাকচার।
  যেমন প্লেটের গাদা — শেষ প্লেট প্রথম সরানো হয়।

- **Queue (কিউ):**
  First In First Out (FIFO) ডেটা স্ট্রাকচার।
  যেমন লাইনের প্রথম ব্যক্তি প্রথম সেবা পায়।

- **Tree (ট্রি):**
  হায়ারার্কিক্যাল ডেটা স্ট্রাকচার, যেমন ফাইল সিস্টেম।
  জনপ্রিয় ধরন হলো Binary Tree, Binary Search Tree।

- **Graph (গ্রাফ):**
  নোড ও এজের সংযোগের মাধ্যমে ডেটা মডেল।
  যেমন সোশ্যাল নেটওয়ার্ক বা রুট ম্যাপ।

- **Hash Table (হ্যাশ টেবিল):**
  কী-ভ্যালু পেয়ার সঞ্চয়ের জন্য দ্রুত অ্যাক্সেসের ডেটা স্ট্রাকচার।

## ২. Algorithms (অ্যালগরিদম)

সমস্যা সমাধানের ধাপে ধাপে প্রক্রিয়া বা নিয়ম।

জনপ্রিয় অ্যালগরিদমের ধরন:

- **Sorting Algorithms (সর্টিং):**
  যেমন Bubble Sort, Selection Sort, Insertion Sort, Merge Sort, Quick Sort
  — ডেটাকে সাজানোর জন্য।

- **Searching Algorithms (সার্চিং):**
  যেমন Linear Search, Binary Search
  — ডেটার মধ্যে কোন ভ্যালু খুঁজে বের করার জন্য।

- **Divide and Conquer:**
  সমস্যা ছোট ছোট ভাগে ভাগ করে সমাধান।
  যেমন Merge Sort, Quick Sort।

- **Dynamic Programming:**
  সমস্যা ছোট ছোট সাব-প্রবলেমে ভাগ করে তাদের সমাধান স্মরণ করে বড় সমস্যা সমাধান করা।

- **Greedy Algorithms:**
  প্রতিটি ধাপে সর্বোত্তম বিকল্প নেয়া।
  যেমন Minimum Spanning Tree (Prim’s, Kruskal’s Algorithms)।

- **Backtracking:**
  সম্ভাব্য সব সমাধান চেষ্টা করে সঠিক সমাধান খোঁজা।

## ৩. DSA এর ব্যবহার

- সফটওয়্যার ডেভেলপমেন্ট
- গেম ডেভেলপমেন্ট
- ডাটাবেস ম্যানেজমেন্ট
- নেটওয়ার্কিং
- আর্টিফিসিয়াল ইন্টেলিজেন্স

## সংক্ষেপে

DSA হলো এমন একটি টুলকিট, যা তোমাকে দ্রুত, স্মার্ট এবং কার্যকরী প্রোগ্রাম লেখতে সাহায্য করে।








# ✅Java তে import কী এবং কেন ব্যবহার করা হয়?

-----------------------------
## ১. import কী?
-----------------------------
Java তে `import` কীওয়ার্ড ব্যবহার করা হয় অন্য প্যাকেজের ক্লাস বা ইন্টারফেসগুলোকে বর্তমানে ব্যবহার করা ক্লাসে আনতে।

এর মাধ্যমে আমরা সহজেই অন্য জাভা ফাইল বা লাইব্রেরির ক্লাস/ইন্টারফেস ব্যবহার করতে পারি।

-----------------------------
## ২. import এর প্রয়োজনীয়তা
-----------------------------
- Java এর প্রতিটি ক্লাস একটি প্যাকেজের অংশ।
- প্যাকেজ ভিন্ন হলে ক্লাসের পুরো নাম (fully qualified name) ব্যবহার করতে হয়, যেমন: `java.util.LinkedList`
- import করলে পুরো নাম না লিখে সরাসরি ক্লাসের নাম ব্যবহার করা যায়।

-----------------------------
## ৩. import এর ধরন
-----------------------------
১. নির্দিষ্ট ক্লাস ইমপোর্ট:
    ```java
    import java.util.Scanner;
    ```
    — Scanner ক্লাসটি java.util প্যাকেজ থেকে ব্যবহার করতে হবে।

২. প্যাকেজের সব ক্লাস ইমপোর্ট:
    ```java
    import java.util.*;
    ```
    — java.util প্যাকেজের সব ক্লাস একসাথে ইমপোর্ট হবে।

-----------------------------
## ৪. import এর ব্যবহার উদাহরণ
-----------------------------
```java
import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        System.out.println("Hello, " + name);
    }
}
```

এখানে `import java.util.Scanner;` না দিলে, পুরো নাম লিখতে হত:
`java.util.Scanner sc = new java.util.Scanner(System.in);`

-----------------------------
## ৫. import সম্পর্কে গুরুত্বপূর্ণ বিষয়
-----------------------------
- `import` স্টেটমেন্ট ক্লাস ফাইলের প্রথমে প্যাকেজ ডিক্লারেশনের পরে বসে।
- import স্টেটমেন্ট কোডের কার্যকারিতায় প্রভাব ফেলে না, শুধু লেখার সুবিধার জন্য।
- একই নামের দুই ক্লাস থাকলে, পুরো নাম ব্যবহার করতে হয়।






# ✅java.util প্যাকেজ: বিস্তারিত পরিচিতি

১. java.util কি?
-------------------
java.util হলো Java Standard Library এর একটি প্যাকেজ, যা বিভিন্ন ইউটিলিটি ক্লাস ও ইন্টারফেস প্রদান করে।
এই প্যাকেজে ডেটা স্ট্রাকচার (Collections), ডেট ও টাইম, রেন্ডম নম্বর, স্ট্রিং টোকেনাইজার, স্ক্যানার ইত্যাদি অন্তর্ভুক্ত।

২. java.util এর প্রধান অংশসমূহ
---------------------------------
- Collections Framework: List, Set, Map, Queue, Stack ইত্যাদি ডেটা স্ট্রাকচার ক্লাস ও ইন্টারফেস।
- Utility Classes: Collections, Arrays, Objects (ডেটা ম্যানিপুলেশন ও অপারেশন)
- Date and Time: Date, Calendar, TimeZone ইত্যাদি (Java 8 এর আগে)
- Random: রেন্ডম নম্বর জেনারেটর ক্লাস
- Scanner: ইউজার ইনপুট নেওয়ার জন্য ক্লাস
- StringTokenizer: স্ট্রিং পার্স করার জন্য ক্লাস
- Timer ও TimerTask: নির্দিষ্ট সময় পর কাজ করানোর জন্য ক্লাস

৩. import কেন প্রয়োজন?
-------------------------
java.util প্যাকেজের ক্লাসগুলো ব্যবহার করার জন্য import করতে হয়।
উদাহরণ:
import java.util.ArrayList;
import java.util.Scanner;

৪. java.util এর উদাহরণ
--------------------------
```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class JavaUtilExample {
    public static void main(String[] args) {
        // ArrayList ব্যবহার
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(9);

        // Collections ক্লাস দিয়ে sorting
        Collections.sort(numbers);
        System.out.println("Sorted numbers: " + numbers);

        // Scanner দিয়ে ইনপুট নেওয়া
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name);

        scanner.close();
    }
}
```

৫. java.util এর ব্যবহার ক্ষেত্র
--------------------------------
- ডেটা স্ট্রাকচার ও এলগরিদম ইমপ্লিমেন্টেশনে।
- ইউজার ইনপুট সংগ্রহে।
- ডেটা প্রসেসিং ও ম্যানিপুলেশনে।
- টাইম-সেন্সিটিভ টাস্ক ও শিডিউলিংয়ে।

৬. সংক্ষেপে
-------------
- java.util প্যাকেজ Java প্রোগ্রামিংয়ের জন্য অত্যন্ত গুরুত্বপূর্ণ।
- Collections, Scanner, Date ইত্যাদি ক্লাস সরবরাহ করে।
- import করে ব্যবহার করা হয়।




# ✅Java Array ব্যাখ্যা

## ১. Array কি?
Array হলো একই ধরনের ডেটার ধারাবাহিক সংগ্রহ, যা মেমোরির এক জায়গায় ধারাবাহিকভাবে সঞ্চিত হয়।
সহজভাবে বলতে গেলে, এটি একটি container যা একই ধরনের একাধিক মান (value) একসাথে রাখে।

## ২. Array Declaration এবং Initialization
Java-তে Array ডিক্লেয়ার করার দুটি স্টাইল আছে:

- প্রথম পদ্ধতি:
```java
dataType[] arrayName = new dataType[size];
```
উদাহরণ:
```java
int[] numbers = new int[5];  // ৫টি ইন্টিজার মান রাখার জন্য অ্যারে
```

- দ্বিতীয় পদ্ধতি (Direct Initialization):
```java
dataType[] arrayName = {value1, value2, value3, ...};
```
উদাহরণ:
```java
int[] numbers = {10, 20, 30, 40, 50};
```

## ৩. Array এর Indexing
- Array-এর প্রথম উপাদানের ইনডেক্স হল ০।
- সর্বশেষ উপাদানের ইনডেক্স হল `array.length - 1`
- উদাহরণ:
```java
int firstNumber = numbers[0];     // ১০
int lastNumber = numbers[4];      // ৫০
```

## ৪. Array Traversal (Loop দিয়ে Array দেখা)
Array এর প্রতিটি উপাদান দেখতে সাধারণত লুপ ব্যবহার করা হয়:

```java
for(int i = 0; i < numbers.length; i++) {
    System.out.println(numbers[i]);
}
```

অথবা For-Each লুপ (Enhanced for loop):
```java
for(int num : numbers) {
    System.out.println(num);
}
```

## ৫. Array এর ব্যবহার
- একত্রে ডেটা সঞ্চয় করা
- ডেটা প্রসেসিং যেমন: যোগফল, গড়, সর্বোচ্চ/সর্বনিম্ন মান খোঁজা
- ডেটা সার্চিং এবং সর্টিং এর জন্য

## ৬. পূর্ণ উদাহরণ: Array তে সংখ্যার যোগফল
```java 
public class ArrayExample {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25};
        int sum = 0;

        for(int num : numbers) {
            sum += num;
        }
        System.out.println("Array এর সব সংখ্যার যোগফল: " + sum);
    }
}
```

## ৭. গুরুত্বপূর্ণ বিষয়
- Array সাইজ একবার ঠিক হলে পরিবর্তন করা যায় না
- একই ধরনের ডেটা সংরক্ষণ করতে হয় (যেমন: সব int, সব String)
- Array.length দিয়ে অ্যারের সাইজ পাওয়া যায়

## ৮. সংক্ষিপ্তসার
Array হলো Java-র একটি মৌলিক ডেটা স্ট্রাকচার যা একই ধরনের একাধিক মান একসাথে সংরক্ষণ করে এবং সহজে অ্যাক্সেসের সুবিধা দেয়।






# ✅Java LinkedList বিস্তারিত ব্যাখ্যা

১. import কী?
---------------
import হলো Java এর একটি কীওয়ার্ড যা অন্য প্যাকেজের ক্লাস বা ইন্টারফেসগুলোকে আমাদের বর্তমান প্রোগ্রামে ব্যবহারের জন্য আনতে সাহায্য করে।

২. java.util.LinkedList কি?
---------------------------
LinkedList হলো Java Collection Framework এর একটি ক্লাস, যা 'java.util' প্যাকেজের মধ্যে থাকে।
এটি একটি ডাবল-লিঙ্কড লিস্ট ডেটা স্ট্রাকচার ইমপ্লিমেন্ট করে।
অর্থাৎ, এটি নোডের একটি সিরিজ যেখানে প্রতিটি নোডের ডেটা এবং পূর্ববর্তী ও পরবর্তী নোডের রেফারেন্স থাকে।

৩. কেন import করতে হয়?
-----------------------
যদি আমরা Java এর বিল্ট-ইন ক্লাস ব্যবহার করতে চাই যেগুলো অন্য প্যাকেজে আছে, তাহলে আমাদের সেই ক্লাসটি import করতে হয়।

import না করলে:
- ক্লাসের পুরো পাথ লিখতে হয়, যেমন: java.util.LinkedList list = new java.util.LinkedList<>();
- কোড দীর্ঘ এবং অগোছালো হয়।

import করার ফলে:
- সরাসরি ক্লাসের নাম ব্যবহার করা যায়, যেমন: LinkedList list = new LinkedList<>();

৪. LinkedList এর সুবিধা
----------------------
- ডাইনামিক সাইজ: অ্যারে থেকে আলাদা, যেখানে সাইজ নির্দিষ্ট থাকে, LinkedList ডাইনামিকভাবে বড় বা ছোট হতে পারে।
- দ্রুত ইনসার্ট এবং ডিলিট: বিশেষ করে মাঝখানে ইনসার্ট/ডিলিট করার সময় অ্যারে থেকে দ্রুত।
- ডাবল-লিঙ্কড হওয়ায় দুই দিক থেকেই ট্রাভার্স করা যায়।

৫. উদাহরণ: import এবং LinkedList ব্যবহার
------------------------------------------
```java
import java.util.LinkedList;

public class Example {
    public static void main(String[] args) {
        // LinkedList অবজেক্ট তৈরি
        LinkedList<String> fruits = new LinkedList<>();

        // ডেটা যোগ করা
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        // প্রথমে ডেটা যোগ করা
        fruits.addFirst("Orange");

        // ডেটা প্রিন্ট করা
        System.out.println(fruits);
    }
}
```

আউটপুট:
[Orange, Apple, Banana, Mango]

৬. LinkedList এর ব্যবহার ক্ষেত্র
-------------------------------
- যেখানে ডাইনামিক ডেটা সঞ্চয় করতে হয়, যেমন টাস্ক লিস্ট, প্লেলিস্ট।
- মাঝখানে ডেটা যুক্ত বা মুছে ফেলা হয় বারবার।
- যেখানে দুই দিক থেকে ট্রাভার্স করার প্রয়োজন হয়।
- কিউ (Queue) এবং স্ট্যাক (Stack) ইমপ্লিমেন্টেশনে।

৭. সংক্ষেপে
------------
- import লাইনটি Java কোডে LinkedList ক্লাসকে সহজে ব্যবহারের জন্য আনে।
- LinkedList হলো একটি শক্তিশালী ডেটা স্ট্রাকচার, যা ডাইনামিক মেমোরি ম্যানেজমেন্ট এবং দ্রুত ইনসার্ট/ডিলিট করতে সাহায্য করে।







# ✅Set in Java: বিস্তারিত ব্যাখ্যা

১. Set কি?
---------------
Set হলো Java Collection Framework এর একটি ইন্টারফেস যা ইউনিক এলিমেন্টগুলো সংগ্রহ করার জন্য ব্যবহৃত হয়।
এটি কোনো ডুপ্লিকেট এলিমেন্ট রাখে না এবং এলিমেন্টগুলোর কোনো নির্দিষ্ট অর্ডার থাকে না।

২. Set এর প্রধান ইমপ্লিমেন্টেশন
--------------------------------
- HashSet: দ্রুত সার্চ, ইনসার্ট এবং ডিলিট অপারেশন দেয় কিন্তু এলিমেন্টের অর্ডার গ্যারান্টি দেয় না।
- LinkedHashSet: HashSet এর মত কিন্তু ইনসার্টেড অর্ডার মেইনটেইন করে।
- TreeSet: SortedSet ইমপ্লিমেন্টেশন, এলিমেন্টগুলোকে ক্রমানুসারে সঞ্চয় করে।

৩. import কেন প্রয়োজন?
-----------------------
Set ইন্টারফেস এবং এর ইমপ্লিমেন্টেশনগুলো java.util প্যাকেজের অংশ।
তাই ব্যবহার করার জন্য import করতে হয়, যেমন:
import java.util.Set;
import java.util.HashSet;

৪. Set এর বৈশিষ্ট্য
------------------
- কোনো ডুপ্লিকেট এলিমেন্ট রাখে না।
- এলিমেন্টগুলো unordered বা ordered হতে পারে ইমপ্লিমেন্টেশনের উপর নির্ভর করে।
- সাধারণত দ্রুত ডাটা সার্চ করার জন্য উপযোগী।

৫. উদাহরণ: HashSet ব্যবহার
-----------------------------
```java
import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();

        // ডেটা যোগ করা
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Apple");  // ডুপ্লিকেট, যোগ হবে না

        // Set প্রিন্ট করা
        System.out.println(fruits);
    }
}
```

আউটপুট (অর্ডার ভিন্ন হতে পারে):
[Apple, Banana, Mango]

৬. Set এর ব্যবহার ক্ষেত্র
-----------------------
- যেখানে ইউনিক ডেটা সঞ্চয় করতে হয়, যেমন ইউজার আইডি, ইমেইল, ট্যাগ ইত্যাদি।
- দ্রুত উপস্থিতি চেক করার জন্য (contains অপারেশন)।
- ডুপ্লিকেট এলিমেন্ট বাদ দেওয়ার প্রয়োজন যেখানে হয়।

৭. সংক্ষেপে
------------
- Set হলো একটি কালেকশন যা ইউনিক এলিমেন্ট রাখে।
- Java তে Set ইন্টারফেস এবং এর বিভিন্ন ইমপ্লিমেন্টেশন রয়েছে।
- import করা হলে সরাসরি Set বা তার ইমপ্লিমেন্টেশন ব্যবহার করা যায়।





# ✅Map in Java: বিস্তারিত ব্যাখ্যা

১. Map কি?
---------------
Map হলো Java Collection Framework এর একটি ইন্টারফেস যা কী-ভ্যালু (key-value) জোড়া হিসেবে ডেটা সংরক্ষণ করে।
প্রতিটি কী ইউনিক হয় এবং সেটার সাথে একটি ভ্যালু যুক্ত থাকে।
Map এ ডেটা স্টোরেজ তালিকার মতো নয়, বরং কী-এর মাধ্যমে অ্যাক্সেস করা হয়।

২. Map এর প্রধান ইমপ্লিমেন্টেশন
--------------------------------
- HashMap: দ্রুত অপারেশন দেয়, এলিমেন্টগুলো কোনো নির্দিষ্ট অর্ডারে থাকে না।
- LinkedHashMap: HashMap এর মত, কিন্তু ইনসার্টেড অর্ডার মেইনটেইন করে।
- TreeMap: SortedMap ইমপ্লিমেন্টেশন, কী গুলো ক্রমানুসারে সঞ্চয় করে।

৩. import কেন প্রয়োজন?
-----------------------
Map এবং এর ইমপ্লিমেন্টেশনগুলো java.util প্যাকেজের অংশ।
তাই ব্যবহার করার জন্য import করতে হয়, যেমন:
import java.util.Map;
import java.util.HashMap;

৪. Map এর বৈশিষ্ট্য
------------------
- কী ইউনিক, কিন্তু ভ্যালু ডুপ্লিকেট হতে পারে।
- কী দিয়ে ডেটা দ্রুত অ্যাক্সেস, যোগ, আপডেট ও ডিলিট করা যায়।
- অর্ডার ইমপ্লিমেন্টেশনের ওপর নির্ভর করে থাকতে বা নাও থাকতে পারে।

৫. উদাহরণ: HashMap ব্যবহার
-----------------------------
```java
import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer, String> studentMap = new HashMap<>();

        // কী-ভ্যালু জোড়া যোগ করা
        studentMap.put(101, "Rakib");
        studentMap.put(102, "Sadia");
        studentMap.put(103, "Jahid");

        // একটি কী এর ভ্যালু পাওয়া
        System.out.println("Student with ID 102: " + studentMap.get(102));

        // সব কী-ভ্যালু প্রিন্ট করা
        for(Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}
```

আউটপুট:
Student with ID 102: Sadia
ID: 101, Name: Rakib
ID: 102, Name: Sadia
ID: 103, Name: Jahid

৬. Map এর ব্যবহার ক্ষেত্র
-----------------------
- যেখানে ডেটা কী-ভ্যালু ফরম্যাটে সংরক্ষণ করতে হয়, যেমন ডাটাবেজ রেকর্ড, কনফিগারেশন সেটিংস।
- দ্রুত কী এর মাধ্যমে ডেটা খুঁজে বের করতে।
- ইউনিক আইডেন্টিফায়ার ও ডেটা অ্যাসোসিয়েশন করার জন্য।

৭. সংক্ষেপে
------------
- Map হলো একটি কালেকশন ইন্টারফেস যা কী-ভ্যালু জোড়া রাখে।
- Java তে HashMap, LinkedHashMap, TreeMap ইত্যাদি ইমপ্লিমেন্টেশন আছে।
- import করে সরাসরি Map এবং এর ক্লাসগুলো ব্যবহার করা যায়।



# ✅Stack in Java: বিস্তারিত ব্যাখ্যা

১. Stack কি?
---------------
Stack হলো একটি লিনিয়ার ডেটা স্ট্রাকচার যা LIFO (Last In First Out) নিয়মে কাজ করে।
অর্থাৎ, যেটি শেষ এ রাখা হয়, সেটি প্রথমে বের হয়।
Java তে Stack ক্লাস java.util প্যাকেজে পাওয়া যায়।

২. Stack এর import কেন প্রয়োজন?
---------------------------------
Stack ক্লাসটি java.util প্যাকেজের অংশ, তাই ব্যবহার করার জন্য import করতে হয়:
import java.util.Stack;

৩. Stack এর প্রধান মেথডসমূহ
----------------------------
- push(element): Stack এর উপরে একটি এলিমেন্ট যোগ করে।
- pop(): Stack থেকে সর্বশেষ যোগ করা এলিমেন্টটি সরিয়ে ফেলে এবং তা রিটার্ন করে।
- peek(): Stack এর উপরের এলিমেন্টটি দেখে কিন্তু সরায় না।
- isEmpty(): Stack খালি কিনা চেক করে।
- search(element): Stack এ কোনো এলিমেন্ট আছে কিনা এবং তার পজিশন দেয়।

৪. উদাহরণ: Stack ব্যবহার
--------------------------
```java
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Stack এ এলিমেন্ট যোগ করা
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Stack এর উপরের এলিমেন্ট দেখা
        System.out.println("Top element: " + stack.peek()); // আউটপুট: 30

        // Stack থেকে এলিমেন্ট সরানো
        System.out.println("Popped element: " + stack.pop()); // আউটপুট: 30

        // Stack খালি কিনা চেক করা
        System.out.println("Is stack empty? " + stack.isEmpty()); // আউটপুট: false

        // Stack এর বর্তমান অবস্থা প্রিন্ট করা
        System.out.println("Stack elements: " + stack); // আউটপুট: [10, 20]
    }
}
```

৫. Stack এর ব্যবহার ক্ষেত্র
--------------------------
- ফাংশন কল স্ট্যাক, যেখানে ফাংশন রিটার্নের আগে তার অবস্থা রাখা হয়।
- ব্র্যাকেট ম্যাচিং এবং এক্সপ্রেশন ইভ্যালুয়েশন।
- Undo/Redo ফিচার ইমপ্লিমেন্টেশন।
- রিভার্সাল অপারেশন।

৬. সংক্ষেপে
------------
- Stack হলো LIFO ভিত্তিক ডেটা স্ট্রাকচার।
- Java তে Stack ক্লাস দিয়ে এটি ইমপ্লিমেন্ট করা হয়।
- import করে সহজেই Stack ব্যবহার করা যায়।






# ✅Queue in Java: বিস্তারিত ব্যাখ্যা

১. Queue কি?
---------------
Queue হলো একটি লিনিয়ার ডেটা স্ট্রাকচার যা FIFO (First In First Out) নিয়মে কাজ করে।
অর্থাৎ, প্রথমে যেটি যোগ করা হয় সেটি প্রথমে বের হয়।
Java তে Queue ইন্টারফেস হিসেবে আছে এবং বিভিন্ন ক্লাস দ্বারা ইমপ্লিমেন্ট করা হয়।

২. Queue এর import কেন প্রয়োজন?
---------------------------------
Queue এবং এর ইমপ্লিমেন্টেশনগুলো java.util প্যাকেজের অংশ।
তাই ব্যবহার করার জন্য import করতে হয়:
import java.util.Queue;
import java.util.LinkedList; // সাধারণত Queue হিসেবে LinkedList ব্যবহার হয়

৩. Queue এর প্রধান মেথডসমূহ
----------------------------
- add(element): Queue তে একটি এলিমেন্ট যোগ করে, পূর্ণ হলে Exception দেয়।
- offer(element): Queue তে এলিমেন্ট যোগ করে, পূর্ণ হলে false রিটার্ন করে।
- remove(): Queue থেকে ফ্রন্টের এলিমেন্ট সরিয়ে দেয় এবং রিটার্ন করে।
- poll(): Queue থেকে ফ্রন্টের এলিমেন্ট সরিয়ে দেয়, খালি হলে null রিটার্ন করে।
- element(): Queue এর ফ্রন্ট এলিমেন্ট দেখায়, খালি হলে Exception দেয়।
- peek(): Queue এর ফ্রন্ট এলিমেন্ট দেখায়, খালি হলে null রিটার্ন করে।

৪. উদাহরণ: Queue (LinkedList ব্যবহার)
---------------------------------------
```java
import java.util.Queue;
import java.util.LinkedList;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // Queue তে এলিমেন্ট যোগ করা
        queue.add("Rakib");
        queue.add("Sadia");
        queue.offer("Jahid");

        // ফ্রন্ট এলিমেন্ট দেখা
        System.out.println("Front element: " + queue.peek()); // আউটপুট: Rakib

        // Queue থেকে এলিমেন্ট সরানো
        System.out.println("Removed element: " + queue.poll()); // আউটপুট: Rakib

        // Queue এর বর্তমান অবস্থা প্রিন্ট করা
        System.out.println("Queue elements: " + queue); // আউটপুট: [Sadia, Jahid]
    }
}
```

৫. Queue এর ব্যবহার ক্ষেত্র
--------------------------
- যেখানে ডেটা সিরিয়াল ভিত্তিতে প্রসেস করতে হয়, যেমন প্রিন্ট জব, টাস্ক শিডিউলিং।
- ব্রডকাস্ট, ব্যাচ প্রসেসিং।
- ব্রেডথ-ফার্স্ট সার্চ (BFS) অ্যালগরিদমে।

৬. সংক্ষেপে
------------
- Queue হলো FIFO ভিত্তিক ডেটা স্ট্রাকচার।
- Java তে Queue ইন্টারফেস এবং LinkedList বা PriorityQueue ক্লাস দিয়ে ইমপ্লিমেন্ট করা হয়।
- import করে সহজেই Queue ব্যবহার করা যায়।







# ✅Class এবং Object: বিস্তারিত ব্যাখ্যা

১. Class কি?
---------------
Class হলো একটি ব্লুপ্রিন্ট বা টেমপ্লেট যা অবজেক্ট তৈরি করার জন্য ব্যবহার করা হয়।
এতে ডেটা (Properties বা Fields) এবং ফাংশন (Methods) থাকে।
সহজভাবে বলতে গেলে, Class হলো কোন কিছু এর ধরন বা কাঠামো।

২. Object কি?
----------------
Object হলো Class এর বাস্তবায়ন বা উদাহরণ (instance)।
এটি মেমোরিতে আলাদা একটি জায়গায় থাকে এবং Class এর প্রোপার্টি ও মেথডস নিয়ে কাজ করে।

৩. Class ও Object এর সম্পর্ক
--------------------------------
- Class হলো ডিজাইন, আর Object হলো সেই ডিজাইনের বাস্তব রূপ।
- অনেক Object একই Class থেকে তৈরি হতে পারে, কিন্তু প্রত্যেকটির আলাদা মেমোরি স্পেস থাকে।

৪. Class কিভাবে ডিক্লেয়ার করতে হয়?
--------------------------------------
```java
public class Car {
    // Properties (Fields)
    String color;
    String model;

    // Method
    void drive() {
        System.out.println("Car is driving");
    }
}
```

৫. Object কিভাবে তৈরি এবং ব্যবহার করতে হয়?
---------------------------------------------
```java
public class Main {
    public static void main(String[] args) {
        // Car ক্লাস থেকে একটি অবজেক্ট তৈরি
        Car myCar = new Car();

        // অবজেক্টের প্রোপার্টি অ্যাক্সেস এবং সেট করা
        myCar.color = "Red";
        myCar.model = "Toyota";

        // অবজেক্টের মেথড কল করা
        myCar.drive();

        System.out.println("Car model: " + myCar.model);
        System.out.println("Car color: " + myCar.color);
    }
}
```

৬. Uses of Class and Object
-----------------------------
- প্রোগ্রামকে মডুলার এবং পুনঃব্যবহারযোগ্য করে তোলে।
- বাস্তব জগতের entities কে প্রোগ্রামিংয়ে সহজে মডেল করতে সাহায্য করে।
- Object-Oriented Programming (OOP) এর মূল ভিত্তি।

৭. সংক্ষেপে
------------
- Class হলো ডিজাইন বা টেমপ্লেট।
- Object হলো সেই ডিজাইনের বাস্তব উদাহরণ।
- Java তে Class দিয়ে Object তৈরি করা হয় এবং ব্যবহার করা হয়।




# ✅Object-Oriented Programming (OOP) in Java: পূর্ণাঙ্গ ও বিস্তারিত ব্যাখ্যা

১. OOP কি?
---------------
Object-Oriented Programming (OOP) হলো প্রোগ্রামিং প্যারাডাইম যা বাস্তব জগতের ধারণা অবজেক্ট ভিত্তিক মডেলিং করে।
এতে ডেটা এবং ফাংশন (মেথড) একসাথে থাকে একটি অবজেক্টে।
OOP কোডকে বেশি পুনঃব্যবহারযোগ্য, মডুলার ও রক্ষণাবেক্ষণযোগ্য করে তোলে।

২. OOP এর চারটি মূল স্তম্ভ (Pillars)
-----------------------------------
১) Encapsulation (এনক্যাপসুলেশন)
    - ডেটা এবং মেথড একসাথে একটি ইউনিটে (ক্লাসে) লুকানো।
    - ডেটাকে বাইরের সরাসরি অ্যাক্সেস থেকে রক্ষা করা।
    - Access modifiers (private, public, protected) ব্যবহার করে ডেটা গোপন রাখা হয়।
    - Getter এবং Setter মেথড দিয়ে ডেটা অ্যাক্সেস করা হয়।

২) Inheritance (ইনহেরিটেন্স)
    - একটি ক্লাস অন্য ক্লাস থেকে প্রপার্টি ও মেথড গ্রহণ করে।
    - কোডের পুনঃব্যবহার এবং এক্সটেনশনের সুবিধা দেয়।
    - Java তে 'extends' কীওয়ার্ড দিয়ে ইনহেরিটেন্স করা হয়।
    - Superclass (parent) এবং Subclass (child) ধারণা।

৩) Polymorphism (পলিমরফিজম)
    - একই ইন্টারফেস দিয়ে ভিন্ন ভিন্ন রূপে আচরণ করা।
    - Compile-time polymorphism (Method Overloading) এবং Run-time polymorphism (Method Overriding) রয়েছে।
    - Overloading: একই নামে বিভিন্ন প্যারামিটার বিশিষ্ট মেথড।
    - Overriding: Subclass এ Superclass এর মেথড নতুনভাবে ইমপ্লিমেন্ট করা।

৪) Abstraction (অ্যাবস্ট্রাকশন)
    - জটিলতা লুকিয়ে কেবল প্রয়োজনীয় অংশ প্রকাশ করা।
    - Abstract class ও Interface দিয়ে ইমপ্লিমেন্ট করা হয়।
    - Abstract class এ কিছু মেথডের বাস্তবায়ন থাকতে পারে, Interface এ থাকে শুধু মেথডের সিগনেচার।

৩. OOP এর বাকি গুরুত্বপূর্ণ বিষয়সমূহ
---------------------------------------
- Constructor: অবজেক্ট তৈরির সময় ক্লাসের প্রাথমিক অবস্থা সেট করে।
- this কীওয়ার্ড: অবজেক্ট নিজেকে রেফার করে।
- super কীওয়ার্ড: পেরেন্ট ক্লাসের মেথড বা কন্সট্রাক্টর অ্যাক্সেস করতে ব্যবহৃত।
- final কীওয়ার্ড: ক্লাস, মেথড বা ভেরিয়েবলকে পরিবর্তন বা ওভাররাইড করা থেকে রক্ষা করে।
- Static keyword: ক্লাস লেভেল মেম্বার ডিফাইন করতে ব্যবহৃত, যা অবজেক্ট স্পেসিফিক নয়।
- Interface: মেথড সিগনেচার সংজ্ঞায়িত করে, মাল্টিপল ইন্টারফেস ইমপ্লিমেন্ট করা যায়।


৬. OOP এর সুবিধা (Advantages)
--------------------------------
- কোড রিইউজ (Reuse) করা সহজ হয়।
- প্রোগ্রাম ভালোভাবে মডুলার ও মেইনটেনেবল হয়।
- বাস্তব জগতের সমস্যা সহজে মডেল করা যায়।
- নিরাপত্তা (Encapsulation এর মাধ্যমে) বৃদ্ধি পায়।
- বড় বড় প্রজেক্টে দলবদ্ধ কাজ সহজ হয়।

৭. OOP এর সীমাবদ্ধতা (Disadvantages)
----------------------------------------
- ছোট প্রজেক্টের জন্য কিছুটা বেশি জটিল হতে পারে।
- কিছুক্ষেত্রে অতিরিক্ত মেমোরি ব্যবহার করতে পারে।
- সঠিক ডিজাইন না হলে কোড জটিল হয়ে যেতে পারে।

৮. সংক্ষেপে
-------------
- OOP হলো অবজেক্ট ভিত্তিক প্রোগ্রামিং পদ্ধতি।
- এর মূল স্তম্ভ: Encapsulation, Inheritance, Polymorphism, Abstraction।
- Java একটি পুরাপুরি OOP ল্যাঙ্গুয়েজ।
- ভালো ডিজাইন ও পরিকল্পনার মাধ্যমে উন্নত সফটওয়্যার তৈরি করা সম্ভব।






# ✅Java Static Keyword এবং অন্যান্য Modifier এর বিস্তারিত ব্যাখ্যা
============================================================

## Static Keyword কি?
-----------------------
Static একটি modifier যা class level এ variable, method, block বা nested class কে নির্দেশ করে। Static মেম্বার objects এর পরিবর্তে class itself এর সাথে যুক্ত থাকে।

অর্থাৎ, static মেম্বার ব্যবহার করতে class এর instance তৈরি করা প্রয়োজন হয় না।

## Static Variable (Static Field)
----------------------------------
- Static variable বা class variable, class এর একটি সাধারণ property হিসেবে কাজ করে।
- সমস্ত object একই static variable share করে।
- Static variable class এর মেমোরিতে একবারই তৈরি হয় (method area)।

উদাহরণ:
```java
public class Example {
    static int count = 0;  // static variable
    
    public Example() {
        count++;
    }

    public static void main(String[] args) {
        Example e1 = new Example();
        Example e2 = new Example();
        System.out.println(Example.count);  // আউটপুট: 2
    }
}
```
ব্যাখ্যা:
count প্রতি instance তৈরিতে ১ করে বাড়ে কারণ এটি static, সব instance একই count share করে।

## Static Method
----------------
- Static method class level এ থাকে এবং instance variable access করতে পারে না (কারণ instance variable অবজেক্টের সাথে যুক্ত)।
- Static method instance method বা variable ছাড়া কাজ করতে পারে।
- Static method কল করতে instance তৈরি করার প্রয়োজন নেই, সরাসরি ClassName.methodName() ব্যবহার করা যায়।

উদাহরণ:
```java
public class MathUtil {
    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int sum = MathUtil.add(5, 10);
        System.out.println(sum);  // আউটপুট: 15
    }
}
```
## Static Block (Static Initialization Block)
---------------------------------------------
- ক্লাস লোড হওয়ার সময় static block একবার চালানো হয়।
- সাধারণত static variables initialization এ ব্যবহার হয়।

উদাহরণ:
```java
public class Test {
    static int data;
    
    static {
        data = 100;
        System.out.println("Static block executed");
    }

    public static void main(String[] args) {
        System.out.println("Data: " + data);
    }
}
```
আউটপুট:
Static block executed
Data: 100

## Static Nested Class
----------------------
- Class এর ভিতরে static class declare করা যায়।
- Static nested class outer class এর instance variables ও methods direct access করতে পারে না।
- Outer class এর নাম দিয়ে nested class কে access করতে হয়।

উদাহরণ:
```java
public class Outer {
    static class Nested {
        void display() {
            System.out.println("Static Nested Class");
        }
    }

    public static void main(String[] args) {
        Outer.Nested obj = new Outer.Nested();
        obj.display();
    }
}
```

## Static এর সীমাবদ্ধতা
-------------------------
- Static method instance variables বা non-static method সরাসরি access করতে পারে না।
- Static মেম্বার class লেভেলে থাকে, তাই polymorphism এ কাজ করে না (method overriding এ বাধা)।

## সংক্ষেপে Static এর ব্যবহার
---------------------------------
- Utility বা helper method তৈরিতে (যেমন Math.sqrt())।
- Constant declaration এ (static final)।
- Singleton pattern এ static block ও variable ব্যবহৃত হয়।
- Shared resource হিসেবে variable রাখার জন্য।

## উপসংহার
-----------
Static keyword জাভাতে class লেভেল এর মেম্বার তৈরি করতে ব্যবহৃত হয় যা objects এর পরিবর্তে class এর সাথে যুক্ত থাকে। এটি instance তৈরি ছাড়াই মেম্বার ব্যবহার সহজ করে তোলে, তবে এটি instance-specific behavior থেকে আলাদা। অন্যান্য modifier যেমন final, abstract ইত্যাদিও বিভিন্ন নিয়ন্ত্রণ এবং behavior নির্ধারণে ব্যবহৃত হয়, যা OOP ডিজাইনে গুরুত্বপূর্ণ ভূমিকা রাখে।


# ✅Object Oriented Programming (OOP) এর ৪টি মূল স্তম্ভ (Four Pillars of OOP)
===========================================================================

## ১) Encapsulation (এনক্যাপসুলেশন)
--------------------------------------
অর্থ: ডেটা এবং ফাংশন একসাথে একটি ইউনিটে (ক্লাসে) লুকানো এবং ডেটাকে বাইরের সরাসরি অ্যাক্সেস থেকে রক্ষা করা।

### উদাহরণ ১: Private ফিল্ড এবং Getter/Setter
---------------------------------------------------
```java
class Person {
    private String name;      // বাইরের থেকে সরাসরি অ্যাক্সেস করা যাবে না
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 0) {       // ভ্যালিডেশন এর মাধ্যমে ডেটা সুরক্ষা
            this.age = age;
        }
    }
}
```
ব্যাখ্যা:
- name এবং age ফিল্ডগুলো private, সরাসরি বাইরে থেকে অ্যাক্সেস নেই।
- Getter/Setter দিয়ে ডেটা অ্যাক্সেস এবং নিয়ন্ত্রণ করা হয়।

### উদাহরণ ২: ব্যাঙ্ক অ্যাকাউন্টের ব্যালেন্স লুকানো
--------------------------------------------------------
```java
class BankAccount {
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if(amount > 0 && balance >= amount) {
            balance -= amount;
        }
    }
}
```
ব্যাখ্যা:
- ব্যালেন্স ডিরেক্টলি পরিবর্তন করা যাবে না।
- Deposit ও Withdraw মেথডের মাধ্যমে ব্যালেন্স পরিবর্তন হয়, এতে নিয়ন্ত্রণ থাকে।

### উদাহরণ ৩: Encapsulation দিয়ে সফটওয়্যার নিরাপত্তা বৃদ্ধি
-----------------------------------------------------------
```java
class User {
    private String password;

    public void setPassword(String password) {
        if(password.length() >= 8) {
            this.password = password;
        } else {
            System.out.println("Password must be at least 8 characters.");
        }
    }

    public boolean checkPassword(String input) {
        return input.equals(password);
    }
}
```
ব্যাখ্যা:
- Password সরাসরি বাইরের কাছে প্রকাশ পায় না।
- Setter মেথডে পাসওয়ার্ডের শর্ত দেয়া হয় (validation)।

## ২) Inheritance (ইনহেরিটেন্স)
---------------------------------
অর্থ: একটি ক্লাস অন্য ক্লাস থেকে প্রপার্টি ও মেথডগুলো গ্রহণ করে।

### উদাহরণ ১: Basic Inheritance
---------------------------------
```java
class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking...");
    }
}
```
ব্যাখ্যা:
- Dog ক্লাস Animal থেকে eat() মেথড পায়।
- Dog নিজস্ব মেথড bark() আছে।

### উদাহরণ ২: Method Overriding (Run-time Polymorphism)
----------------------------------------------------------
```java
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Meow");
    }
}
```
ব্যাখ্যা:
- Cat ক্লাস Animal এর sound() মেথড ওভাররাইড করেছে।
- ওভাররাইডিং এর মাধ্যমে ভিন্ন আচরণ দেওয়া যায়।

### উদাহরণ ৩: Multilevel Inheritance
--------------------------------------
```java
class Vehicle {
    void start() {
        System.out.println("Vehicle started");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving");
    }
}

class SportsCar extends Car {
    void turboBoost() {
        System.out.println("Turbo boost activated!");
    }
}
```
ব্যাখ্যা:
- SportsCar, Car থেকে drive() এবং Vehicle থেকে start() মেথড পায়।
- ইনহেরিটেন্স চেইন তৈরি করে কোড পুনঃব্যবহার বাড়ে।

## ৩) Polymorphism (পলিমরফিজম)
-----------------------------------
অর্থ: একই মেথড বা ইন্টারফেস দিয়ে বিভিন্ন রূপে আচরণ করা।

### উদাহরণ ১: Method Overloading (Compile-time Polymorphism)
------------------------------------------------------------
```java
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}
```
ব্যাখ্যা:
- একই নামের add() মেথড ভিন্ন প্যারামিটার সহ ওভারলোড করা হয়েছে।
- কম্পাইল টাইমে নির্ধারিত হয় কোন মেথড কল হবে।

### উদাহরণ ২: Method Overriding (Run-time Polymorphism)
---------------------------------------------------------
```java
class Shape {
    void draw() {
        System.out.println("Drawing shape");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing circle");
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing rectangle");
    }
}
```
ব্যাখ্যা:
- Shape এর draw() ওভাররাইড করে Circle এবং Rectangle নিজস্ব আচরণ দেয়।
- রানটাইমে নির্ধারিত হয় কোন মেথড কল হবে।

### উদাহরণ ৩: Polymorphism with Interfaces
----------------------------------------------
```java
interface Printable {
    void print();
}

class Document implements Printable {
    public void print() {
        System.out.println("Printing document");
    }
}

class Photo implements Printable {
    public void print() {
        System.out.println("Printing photo");
    }
}
```
ব্যাখ্যা:
- Printable ইন্টারফেস বিভিন্ন ক্লাসে বিভিন্নভাবে ইমপ্লিমেন্ট করা হয়েছে।
- একই ইন্টারফেসের বিভিন্ন রূপ।

## ৪) Abstraction (অ্যাবস্ট্রাকশন)
-----------------------------------
অর্থ: জটিলতা লুকিয়ে কেবল প্রয়োজনীয় তথ্য প্রকাশ করা।

### উদাহরণ ১: Abstract Class
-------------------------------
```java
abstract class Animal {
    abstract void sound();   // Abstract মেথড (implementation নেই)

    void sleep() {
        System.out.println("Sleeping...");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Barking");
    }
}
```
ব্যাখ্যা:
- Animal ক্লাস Abstract, সরাসরি অবজেক্ট তৈরি হয় না।
- Dog ক্লাস sound() মেথড ইমপ্লিমেন্ট করে।

### উদাহরণ ২: Interface ব্যবহার করে Abstraction
------------------------------------------------
```java
interface Vehicle {
    void start();
    void stop();
}

class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike started");
    }

    public void stop() {
        System.out.println("Bike stopped");
    }
}
```
ব্যাখ্যা:
- Interface শুধু মেথড সিগনেচার দেয়।
- Bike ক্লাস সব মেথড ইমপ্লিমেন্ট করে।

### উদাহরণ ৩: Partial Abstraction with Abstract Class
-------------------------------------------------------
```java
abstract class Employee {
    abstract void work();

    void logHours() {
        System.out.println("Logging work hours");
    }
}

class Developer extends Employee {
    @Override
    void work() {
        System.out.println("Writing code");
    }
}
```
ব্যাখ্যা:
- Employee ক্লাস কিছু মেথড ইমপ্লিমেন্ট করে, কিছু Abstract রেখেছে।
- Subclass ঐ Abstract মেথড ইমপ্লিমেন্ট করে।

## সংক্ষেপে:
-----------
- Encapsulation: ডেটা লুকানো এবং Getter/Setter দিয়ে নিয়ন্ত্রণ।
- Inheritance: কোড পুনঃব্যবহার ও এক্সটেনশন।
- Polymorphism: একই মেথডের ভিন্ন আচরণ।
- Abstraction: জটিলতা লুকিয়ে প্রয়োজনীয় তথ্য প্রদান।






# ✅Java Annotations (অ্যানোটেশন) এর বিস্তারিত ব্যাখ্যা
===============================================

## Java Annotations কি?
-----------------------
Annotations হলো Java এর metadata, অর্থাৎ কোড সম্পর্কে অতিরিক্ত তথ্য যা ক্লাস, মেথড, ভেরিয়েবল, প্যারামিটার ইত্যাদির সাথে যুক্ত করা হয়।

এগুলো মূলত কোডকে ব্যাখ্যা বা নির্দেশনা দেয়, এবং কম্পাইলার, IDE বা runtime এ বিভিন্ন প্রক্রিয়ায় ব্যবহৃত হয়।

উদাহরণস্বরূপ, কোনো মেথড Deprecated হলে সেটা চিহ্নিত করার জন্য @Deprecated annotation ব্যবহার করা হয়।

## Annotation এর প্রকারভেদ
-------------------------
১) Built-in Annotations (Java এর নিজস্ব)
২) Custom Annotations (নিজে তৈরি করা)

## Built-in Annotations গুলো
-----------------------------
- @Override : মেথড ওভাররাইড করার সময় ব্যবহার।
- @Deprecated : পুরাতন বা ব্যবহার নিষিদ্ধ কিছু চিহ্নিত করতে।
- @SuppressWarnings : কম্পাইলার ওয়ার্নিং বন্ধ করতে।
- @FunctionalInterface : ইন্টারফেসকে ফাংশনাল ইন্টারফেস হিসেবে চিহ্নিত করতে।

## Annotation কিভাবে ব্যবহার করবেন?
--------------------------------------
সরাসরি @ দিয়ে শুরু করে Annotation ব্যবহার করা হয়।

উদাহরণ:
```java
public class Example {

    @Override
    public String toString() {
        return "Example class";
    }

    @Deprecated
    public void oldMethod() {
        System.out.println("This method is deprecated.");
    }
}
```
## Custom Annotation তৈরি
-------------------------
আপনি নিজের মতো করে Annotation তৈরি করতে পারেন @interface দিয়ে।

উদাহরণ:
```java
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    String value();
    int number() default 0;
}
```
এখানে,
- @Retention বলে Annotation runtime এ থাকবে কি না।
- value() এবং number() হলো Annotation এর element বা attribute।

## Custom Annotation ব্যবহার
```java
@MyAnnotation(value = "Hello", number = 5)
public class Demo {
    // class body
}
```
## Annotation ব্যবহারকারিতার ক্ষেত্র
-----------------------------------
- কোডের metadata হিসেবে
- কোডের ভুল ধরাতে (linting)
- ফ্রেমওয়ার্কে configuration এর বিকল্প হিসেবে (যেমন Spring, Hibernate)
- কোড জেনারেশন ও runtime processing এ

## উপসংহার
------------
Java Annotations প্রোগ্রামিংকে আরও শক্তিশালী, পরিষ্কার এবং maintainable করে তোলে। এটি metadata হিসেবে কাজ করে, যা বিভিন্ন tool এবং framework দ্বারা ব্যবহার হয়।
Annotation ছাড়াও, কাস্টম Annotation তৈরি করে প্রজেক্টের প্রয়োজন অনুযায়ী behavior নির্ধারণ করা সম্ভব।

# ✅Java Generics (জেনেরিকস) এর বিস্তারিত ব্যাখ্যা
====================================================

## Generics কি?
----------------
Generics হলো Java এর একটি শক্তিশালী ফিচার যা ক্লাস, ইন্টারফেস, ও মেথডগুলোকে টাইপ-সেফ ও পুনঃব্যবহারযোগ্য করে তোলে।

সহজ কথায়, Generics ব্যবহার করলে আপনি একই ক্লাস বা মেথডকে বিভিন্ন ডেটা টাইপের জন্য ব্যবহার করতে পারবেন, এবং টাইপ সংক্রান্ত ভুল কমে যায়।

উদাহরণ হিসেবে, একটি লিস্ট যদি Integer বা String অথবা অন্য কোন টাইপের ডেটা ধরে রাখতে পারে, তখন Generics ব্যবহার করা হয়।

## Generics এর প্রয়োজন কেন?
--------------------------------
- টাইপ কাস্টিং (Type Casting) কমানো: Generics ব্যবহার করলে আপনাকে বারবার কাস্টিং করতে হয় না।
- টাইপ সেফটি (Type Safety): কম্পাইল টাইমে টাইপ এরর ধরা যায়।
- পুনঃব্যবহারযোগ্য কোড: একই কোড বিভিন্ন টাইপের জন্য ব্যবহার করা যায়।

## Java Generics এর Syntax
--------------------------------
Generics সাধারণত <> (Angle brackets) এর মধ্যে টাইপ প্যারামিটার দিয়ে লেখা হয়।

উদাহরণ:
```java
class Box<T> {
    private T content;

    public void setContent(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }
}
```
এখানে, T হলো টাইপ প্যারামিটার। যেকোনো টাইপ T এর স্থানে আসতে পারে।

## Generics এর ধরণসমূহ
---------------------------------
১) Generic Classes (জেনেরিক ক্লাস)
২) Generic Interfaces (জেনেরিক ইন্টারফেস)
৩) Generic Methods (জেনেরিক মেথড)
৪) Bounded Type Parameters (বাউন্ডেড টাইপ প্যারামিটার)
৫) Wildcards (ওয়াইল্ডকার্ড)

### ১) Generic Classes উদাহরণ
-----------------------------------
```java
class Box<T> {
    private T content;

    public void setContent(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }
}

public class Main {
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();
        integerBox.setContent(123);
        System.out.println(integerBox.getContent()); // Output: 123

        Box<String> stringBox = new Box<>();
        stringBox.setContent("Hello Generics");
        System.out.println(stringBox.getContent()); // Output: Hello Generics
    }
}
```
ব্যাখ্যা:
- Box ক্লাসে T টাইপের একটি প্রপার্টি আছে।
- যখন Box তৈরি হয় তখন T এর মান দেয়া হয়, যেমন Integer বা String।

### ২) Generic Methods উদাহরণ
--------------------------------
```java
public class Utils {
    public static <T> void printArray(T[] array) {
        for(T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4};
        String[] strArray = {"A", "B", "C"};

        Utils.printArray(intArray);  // Output: 1 2 3 4
        Utils.printArray(strArray);  // Output: A B C
    }
}
```
ব্যাখ্যা:
- এখানে printArray() মেথডটি জেনেরিক এবং যেকোনো টাইপের অ্যারে নিতে পারে।

### ৩) Bounded Type Parameters (সীমাবদ্ধ টাইপ)
-----------------------------------------------
Generics এ আপনি টাইপ প্যারামিটারকে সীমাবদ্ধ করতে পারেন, যেমন শুধুমাত্র Number বা তার সাবক্লাস হতে হবে।

উদাহরণ:
```java
class Calculator<T extends Number> {
    public double add(T a, T b) {
        return a.doubleValue() + b.doubleValue();
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator<Integer> intCalc = new Calculator<>();
        System.out.println(intCalc.add(10, 20));  // Output: 30.0

        Calculator<Double> doubleCalc = new Calculator<>();
        System.out.println(doubleCalc.add(5.5, 4.5));  // Output: 10.0
    }
}
```
ব্যাখ্যা:
- T শুধুমাত্র Number অথবা তার subclass হতে পারে।
- ফলে আপনি যেকোনো সংখ্যা টাইপের উপর কাজ করতে পারবেন।

### ৪) Wildcards (<?>)
----------------------
ওয়াইল্ডকার্ড দিয়ে আপনি বলতে পারেন "কোনো টাইপ", তবে সীমাবদ্ধতা দিতে পারেন:

- unbounded wildcard: List<?> (যেকোনো টাইপ)
- upper bounded wildcard: List<? extends Number> (Number বা subclass)
- lower bounded wildcard: List<? super Integer> (Integer বা superclass)

উদাহরণ:
```java
public void printList(List<?> list) {
    for(Object elem : list) {
        System.out.println(elem);
    }
}
```
ব্যাখ্যা:
- printList যেকোনো ধরনের List নিতে পারে।
- তবে List এর ভিতর কি ধরনের ডেটা সেটা নির্ধারণ করা হয় না।

## Generics এর প্রধান সুবিধা ও ব্যবহার ক্ষেত্র
---------------------------------------------
- Collections Framework এ ব্যাপক ব্যবহার, যেমন ArrayList<T>, HashMap<K,V> ইত্যাদি।
- টাইপ সেফটি ও কোড রিইউজ বাড়ায়।
- কোড রিডেবল ও মেইনটেইনেবল হয়।

## সংক্ষেপে Generics কেন ব্যবহার করবেন?
-------------------------------------------
- একই কোড বিভিন্ন টাইপের জন্য ব্যবহার করতে চান।
- টাইপ কাস্টিং ও টাইপ এরর কমাতে চান।
- জেনেরিক কোড আরও ফ্লেক্সিবল এবং সেফ হয়।

## উপসংহার
------------
Java Generics হলো টাইপ প্যারামিটারাইজড প্রোগ্রামিং যা টাইপ সেফটি ও পুনঃব্যবহারযোগ্যতা বৃদ্ধি করে। 
এটি কোডের গুণগত মান বাড়ায় এবং কম্পাইল টাইমে অনেক ভুল ধরতে সাহায্য করে।



# ✅Java Threads (থ্রেড) এর বিস্তারিত ব্যাখ্যা
===========================================

## Thread কি?
---------------
Thread হলো Java প্রোগ্রামের সবচেয়ে ছোট একক এক্সিকিউশন ইউনিট। 
একক Java প্রোগ্রামে একাধিক থ্রেড থাকতে পারে, এবং প্রতিটি থ্রেড আলাদা আলাদা কাজ সম্পাদন করে একসাথে চলতে পারে — এটিই মুলত Multithreading।

## Multithreading কেন প্রয়োজন?
--------------------------------
- CPU এর সম্পদ (Resource) ভালোভাবে ব্যবহার করতে।
- একই সময়ে একাধিক কাজ (task) সম্পাদন করার জন্য।
- User interface (UI) responsive রাখতে (background এ কাজ চলবে, UI freezed হবে না)।

## Java তে Thread তৈরি করার দুইটি উপায়:
-------------------------------------------
১) Thread class extend করে
২) Runnable interface implement করে

## ১) Thread class extend করে থ্রেড তৈরি
-----------------------------------------
```java
class MyThread extends Thread {
    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println("Thread: " + i);
            try {
                Thread.sleep(500);  // থ্রেড ৫০০ মিলিসেকেন্ড বিরতি নেবে
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start(); // থ্রেড চালু করার জন্য start() মেথড ব্যবহার করতে হবে
    }
}
```

ব্যাখ্যা:
- run() মেথডে থ্রেডের কাজ লেখেন।
- start() মেথড থ্রেড শুরু করে run() মেথড কল করে।
- Thread.sleep(ms) থ্রেডকে নির্দিষ্ট সময়ের জন্য সাসপেন্ড করে।

## ২) Runnable interface implement করে থ্রেড তৈরি
--------------------------------------------------
```java
class MyRunnable implements Runnable {
    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println("Runnable Thread: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable());
        t.start();
    }
}
```

ব্যাখ্যা:
- Runnable interface implement করে run() মেথড override করতে হয়।
- Thread অবজেক্টে Runnable অবজেক্ট পাস করে start() কল করতে হয়।

## Thread এর প্রধান মেথডসমূহ
---------------------------------
- start(): থ্রেড শুরু করে।
- run(): থ্রেডে যা কাজ করাবেন তা run() এ লিখবেন।
- sleep(milliseconds): থ্রেডকে নির্দিষ্ট সময়ের জন্য থামায়।
- join(): বর্তমান থ্রেডকে অপেক্ষা করায় অন্য থ্রেড শেষ হওয়া পর্যন্ত।
- yield(): থ্রেডকে CPU relinquish করতে বলে, অন্য থ্রেড রান করার সুযোগ দেয়।
- interrupt(): থ্রেডকে ইন্টারাপ্ট করে।

## Thread Life Cycle (জীবনচক্র)
---------------------------------
১) New: থ্রেড অবজেক্ট তৈরি হয়েছে কিন্তু start() হয়নি।
২) Runnable: start() কল হয়েছে, রান হওয়ার অপেক্ষায়।
৩) Running: CPU থ্রেডকে রান করাচ্ছে।
৪) Waiting/Blocked: থ্রেড অন্য কোনো থ্রেডের রিসোর্স পাওয়ার জন্য অপেক্ষা করছে বা sleep এ আছে।
৫) Terminated: থ্রেড কাজ শেষ করেছে বা মারা গেছে।

## Synchronization (সমন্বয়)
--------------------------------
Multithreading এ যখন একই ডেটা বা রিসোর্স একাধিক থ্রেড একসাথে এক্সেস করে, তখন সমস্যা হতে পারে (Race condition)।
এজন্য synchronized block/method ব্যবহার করে একসাথে শুধুমাত্র এক থ্রেডই রিসোর্স এক্সেস করবে তা নিশ্চিত করা হয়।

উদাহরণ:
```java
class Counter {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}
```

## Thread Priority (অগ্রাধিকার)
----------------------------------
প্রতিটি থ্রেডের একটি priority থাকে, যা ১ (lowest) থেকে ১০ (highest) পর্যন্ত হতে পারে।
higher priority থ্রেড CPU পাওয়ার সম্ভাবনা বেশি।

## Daemon Thread
-----------------
Daemon থ্রেড হলো ব্যাকগ্রাউন্ড থ্রেড যা জাভা প্রোগ্রাম চলাকালীন কাজ করে, যেমন Garbage Collector।
যখন সব Non-Daemon থ্রেড শেষ হয়, তখন JVM Daemon থ্রেডগুলো বন্ধ করে দেয়।

## Thread Example: Multiple Threads চালানো
-----------------------------------------------
```java
class MyThread extends Thread {
    private String name;

    MyThread(String name) {
        this.name = name;
    }

    public void run() {
        for(int i = 0; i < 3; i++) {
            System.out.println(name + " running: " + i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Thread1");
        MyThread t2 = new MyThread("Thread2");

        t1.start();
        t2.start();
    }
}
```

## উপসংহার
------------
Java Threads ব্যবহার করে একাধিক কাজ একই সাথে করানো সম্ভব। Multithreading প্রোগ্রামের পারফরম্যান্স বাড়ায়, তবে একই রিসোর্স শেয়ারিং এর জন্য Synchronization প্রয়োজন। Thread এর জীবনচক্র, মেথড, Priority, Daemon থ্রেড ইত্যাদি ভালোভাবে বোঝা জরুরি যাতে সঠিক ও দক্ষ multithreaded প্রোগ্রাম লেখা যায়।





# ✅Other Important Modifiers in Java 
---------------------------------------

1) final
-------
- **final variable:** একবার কোনো ভেরিয়েবলের মান সেট করলে আর সেটাকে পরিবর্তন করা যায় না। অর্থাৎ, এটি constant হিসেবে ব্যবহৃত হয়। যদি final variable static এর সাথে ব্যবহৃত হয়, তাহলে এটি compile time constant হয়, যা performance বাড়ায় এবং ভুল এড়ায়।

  উদাহরণ: 
  ```java
  final int MAX = 100;
  ```

  এখানে MAX এর value 100 এ স্থির থাকবে এবং কোনভাবেই পরিবর্তন করা যাবে না।

- **final method:** এই method কে subclass এ override করা যায় না। এটি method এর implementation কে immutable করে দেয়। যদি আপনি চান কোনো method এর আচরণ subclass এ পরিবর্তিত না হোক, তখন final method ব্যবহার করবেন।

  উদাহরণ:
  ```java
  public final void show() {
      System.out.println("Final method");
  }
  ```

- **final class:** এই class কে আর কোনো class extend করতে পারে না। অর্থাৎ subclass তৈরি করা সম্ভব নয়। এর মাধ্যমে class এর design সম্পূর্ণ রূপে safe রাখা যায় এবং কেউ ওভাররাইড করতে পারে না।

  উদাহরণ:
  ```java
  public final class Constants {
      // class body
  }
  ```


2) abstract
----------
- **abstract class:** এটি এমন একটি class যার object সরাসরি তৈরি করা যায় না। এটি সাধারণত inheritance এর জন্য ব্যবহার করা হয়। abstract class এ কিছু method abstract হতে পারে, অর্থাৎ শুধু declare করা থাকবে, implementation থাকবে না। subclass এ অবশ্যই সেই method গুলো implement করতে হয়। এর ফলে inheritance এর মাধ্যমে বিভিন্ন subclass এ বিভিন্ন behaviour প্রদান করা সম্ভব হয়।

  উদাহরণ:
  ```java
  abstract class Animal {
      abstract void sound();  // abstract method, body নেই
      void sleep() {
          System.out.println("Sleeping...");
      }
  }

  class Dog extends Animal {
      void sound() {
          System.out.println("Bark");
      }
  }
  ```

  এখানে Animal class abstract, তাই Animal obj তৈরি করা যাবে না, কিন্তু Dog class থেকে করা যাবে এবং sound() method implement করা হয়েছে।

- **abstract method:** এটি method এর declaration মাত্র, কোন implementation বা বডি থাকে না। subclass এ এটি override করে নির্দিষ্ট কাজ করতে হয়।


3) synchronized
---------------
- Multithreading এ একাধিক থ্রেড যদি একই resource বা method কে একসাথে access করে তাহলে data corruption বা race condition হতে পারে। synchronized keyword এর মাধ্যমে আমরা একটি method বা block কে single-threaded হিসেবে lock করে রাখতে পারি, যাতে একই সময়ে শুধু একটি থ্রেডই access করতে পারে। অন্য থ্রেডগুলো অপেক্ষা করবে যতক্ষণ resource মুক্ত হবে।

- synchronized method বা block এ lock পায় ঐ object বা class যার method বা block এটি ধরে রেখেছে। তাই synchronized ব্যবহারে performance কিছুটা ধীর হতে পারে, কিন্তু safety নিশ্চিত হয়।

  উদাহরণ:
  ```java
  public class BankAccount {
      private int balance = 0;

      public synchronized void deposit(int amount) {
          balance += amount;
      }

      public synchronized void withdraw(int amount) {
          balance -= amount;
      }
  }
  ```

  এখানে deposit ও withdraw method synchronized, তাই এক সময় শুধু একটি থ্রেডই ব্যালেন্স পরিবর্তন করতে পারবে।


4) transient
------------
- Java এর Serialization process এ কোন কোন variable কে serializable object থেকে বাদ দিতে চাইলে transient keyword ব্যবহার করা হয়। transient variable এর মান serialize হওয়ার সময় save হয় না, অর্থাৎ network বা ফাইল এ ট্রান্সফার হয় না। এটি সাধারণত sensitive তথ্য বা অপ্রয়োজনীয় তথ্য serializing এ বাদ দিতে ব্যবহৃত হয়।

  উদাহরণ:
  ```java
  public class User implements Serializable {
      private String name;
      transient String password;  // serialize হবে না
  }
  ```

  Serialization এর সময় password এর মান ফাইল বা স্ট্রিমে যাবে না, তাই security বাড়ে।


5) volatile
-----------
- Multithreading environment এ যখন একটি variable অনেক থ্রেড দ্বারা পড়া ও লেখা হয়, তখন প্রতিটি থ্রেডের cache এ পুরানো মান থাকতে পারে, যা inconsistent হতে পারে। volatile keyword ব্যবহার করলে Java নিশ্চিত করে যে, variable এর latest value সব থ্রেডের জন্য সরাসরি main memory থেকে পড়া হবে।

- অর্থাৎ volatile variable এর পরিবর্তন থ্রেডগুলোর মাঝে দ্রুত এবং সঠিকভাবে প্রদর্শিত হয়। এটি synchronization এর তুলনায় হালকা উপায় কিন্তু শুধুমাত্র visibility সমস্যা সমাধান করে, atomicity নিশ্চিত করে না।

  উদাহরণ:
  ```java
  public class FlagExample {
      private volatile boolean flag = true;

      public void run() {
          while(flag) {
              // wait here until flag becomes false
          }
          System.out.println("Flag is false, exiting loop");
      }

      public void stop() {
          flag = false;
      }
  }
  ```

  এখানে flag volatile থাকার কারণে অন্য থ্রেড থেকে flag false করার পর run() method তৎক্ষণাৎ সেই পরিবর্তন দেখতে পাবে।


## সারসংক্ষেপ
-----------------
- **final**: value, method বা class কে পরিবর্তন থেকে রক্ষা করে।
- **abstract**: inheritance ও polymorphism এর জন্য কাঠামো তৈরি করে যেখানে কিছু method subclass এ implement করতে হয়।
- **synchronized**: থ্রেড সেফটি নিশ্চিত করে একসাথে একাধিক থ্রেড resource access এড়াতে।
- **transient**: serialization থেকে variable exclude করে।
- **volatile**: থ্রেডগুলোর মধ্যে variable এর latest মান visibility নিশ্চিত করে।

এই modifier গুলো Java প্রোগ্রামিং এর বিভিন্ন দিককে নিয়ন্ত্রণ করে এবং নিরাপদ, কার্যকর ও সঠিক কোড লেখায় সাহায্য করে।

