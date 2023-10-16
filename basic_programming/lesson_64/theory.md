<details>
<summary>Sockets</summary>

# What are the data transfer protocols?

**Network data transfer protocols** — a list of rules that define the features and procedure for transmitting information.

## IP — Internet Protocol

He was the first to unite individual PCs into a single network. We can say that this protocol is the simplest. And it
is also unreliable, because it does not confirm the delivery of packages to the recipient, nor does it control the integrity of the data.
Data is transmitted over the IP protocol without establishing a connection.

The main task of IP is the routing of datagrams, that is, we are talking about determining the path of data through the network nodes. Before
to this day, the most popular version was IPv4 with 32-bit addresses. But, as you know, 4.29 billion IPv4 addresses is
a lot, but not enough for a long time. Therefore, there is IPv6, which is designed to solve the problem of address overflow.

## TCP/IP — Transmission Control Protocol/Internet Protocol

This is already a stack of TCP and IP protocols. TCP provides and controls data transmission and monitors reliability and
integrity. IP is responsible for routing. The TCP protocol is often used by other, more complex protocols.

## UDP — User Datagram Protocol

Provides data transfer without creating a preliminary connection between them. UDP is considered insufficiently reliable,
because packets may not only fail to reach, but also be duplicated or come out of order.

But there is also an advantage: the speed of data delivery. That is why UDP is often used in applications that are particularly sensitive to network
delays.

## FTP — File Transfer Protocol

It is used for file transfer. This protocol is not new - it was successfully used long before the advent of IP. It
is still used today when organizing remote access to hosting services.

It is reliable, guarantees data transmission, and operates on the principle of client-server architecture. To work with
the server's file system, the user authenticates (an anonymous option is also possible), after which he gets access.

## DNS

DNS is not only a domain Name system (Domain Name System). It is also a protocol without which this
system would not be able to work. The protocol allows client computers to request the IP address
of a site from the DNS server, plus it helps to exchange databases between DNS servers. The system also uses
TCP and UDP protocols.

## HTTP — HyperText Transfer Protocol

At first, it was a protocol for transmitting HTML documents. Now it is used for the purpose of transmitting arbitrary data on the network.
It is considered a client-server communication protocol without saving an intermediate state. The client is usually
a web browser, although it can also be a search robot. When exchanging information , the HTTP protocol most often uses
TCP/IP.

The HTTP protocol has an HTTPS extension that supports encryption. In it, data is already transmitted over
the TLS cryptographic protocol.

## NTP — Network Time Protocol
In fact, not all transmission protocols are used to exchange the classical type of information. The NTP protocol is used to
synchronize the device's local clock with the time in the global/local network. NTP uses the Marzullo algorithm, as a
result of which the most accurate time source is selected. And NTP also works on top of UDP, which allows it to reach
the maximum data transfer rate. In general, the protocol is quite resistant to changes in delays in the global/local
network.

## SSH — Secure SHell
Provides remote OS management using TCP. SSH encrypts all traffic, while maintaining the ability
to choose an encryption algorithm. This is necessary to transfer passwords and other important information.

And SSH also makes it possible to process any other data transfer protocols. Thus, in addition to remote
control of the computer, through this protocol you will be able to skip any files or even audio/video streams.

SSH is usually used when working with hosting services (the client gets the opportunity to remotely connect to the server and work with
it).

# Sockets

The term "socket programming" refers to writing programs that run on multiple computers on
which all devices are connected to each other via a network.

There are two communication protocols that we can use to program sockets:

- User Datagram Protocol (UDP)
- Transmission Control Protocol (TCP)

The main difference between them is that UDP does not require a connection to be established, which means there is no
a session between the client and the server, whereas TCP is connection-oriented, which means that in order to establish
communication
between the client and the server, an exclusive connection must first be established. .

## Project Setup

Java provides a set of classes and interfaces that take care of the details of low-level interaction between
the client and the server.

They are mostly contained in the package `java.net `, so we need to perform the following import:
`import java.net .*;`
We will also need a package `java.io `, which provides us with input and output streams for writing and reading during
communication:
`import java.io.*;`

For simplicity, we will run client and server programs on the same computer. If we ran them on different
network computers, the only thing that would change is the IP address. In this case, we will use `localhost` at
`127.0.0.1'.

## A simple example

Let's work with the simplest examples related to the client and server. This will be a two-way
communication application in which the client greets the server and the server responds.

We will create a server application in the GreetServer class.java with the following code.

In this article, we will add the main method and global variables to draw attention to how we will
use all servers. In the rest of the examples in this article, we will omit such repetitive code:

<details style="margin-left: 20px;">
<summary>Code example:</summary>

### server part:

```java
import java.io.*;
import java.net.*;

public class SimpleServer {
    public static void main(String[] args) {
// Setting the port for connecting clients
        int port = 12345;
        try {
// Creating a server socket on a specific port
            ServerSocket serverSocket = new ServerSocket(port);

            System.out.println("The server is running and waiting for connection...");

// Waiting for client connection
            Socket clientSocket = serverSocket.accept();

// We receive input and output streams for communication with the client
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(), true);

// We receive a message from the client
            String clientMessage = reader.readLine();
            System.out.println("Message received from client: " + ClientMessage);

// Convert the message and send it back to the client
            String response = clientMessage.toUpperCase();
            writer.println(response);

// Closing connections
            reader.close();
            writer.close();
            clientSocket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

### the client part:

```java
import java.io.*;
import java.net.*;

public class SimpleClient {
    public static void main(String[] args) {
// Setting the server port and host
        int port = 12345;
        String host = "localhost";
        try {
// Connecting to the server by address and port
            Socket socket = new Socket(host, port);

// We receive input and output streams for communicating with the server
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);

// Sending a message to the server
            String message = "Hello, server!";
            writer.println(message);

// We receive and output a response from the server
            String response = reader.readLine();
            System.out.println("Server response: " + response);

// Closing connections
            reader.close();
            writer.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

How the app works

1. Server:

- Starts and listens to port 12345.
- When the client connects, the server reads the string, converts it to uppercase and sends it back.
- After sending the response, the server closes the connection.

2. The client:

- Connects to the server at the address "localhost" and port 12345.
- Sends the string "Hello, server!" to the server.
- Waits and receives a response from the server, outputs it to the console and closes the connection.

Run the server code first and only after the server is started and waiting for connection, run the code
the client. If successful, you should see the interaction between the client and the server through the console.
</details>

<details style="margin-left: 20px;">
<summary>Example of a web socket:</summary>

```java
import java.io.*;
import java.net.*;

public class HttpServer {
    public static void main(String[] args) {
        int port = 8080; // standard port for HTTP
        try {
            ServerSocket serverSocket = new ServerSocket(port);
            System.out.println("Server running on port" + port);

            while (true) {
                Socket clientSocket = serverSocket.accept();
                BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));

// Reading an HTTP request from a client
                String line;
                while (!(line = reader.readLine()).isEmpty()) {
                    System.out.println(line);
                }

// Generating and sending an HTTP response
                String response = "<html><body><h1>Greetings from the server!</h1></body></html>";
                writer.write("HTTP/1.1 200 OK\r\n");
                writer.write("Content-Type: text/html; charset=utf-8\r\n");
                writer.write("Content-Length: " + response.length() + "\r\n");
                writer.write("\r\n");
                writer.write(response);

// Closing threads and Socket
                writer.flush();
                reader.close();
                writer.close();
                clientSocket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

To test this server:

1. Run the server code.
2. Open your web browser.
3. Enter in the address bar `http://localhost:8080 ` and press Enter.

</details>

## How sockets work

By definition, a socket is one of the endpoints of a two—way communication channel between two programs running on
different computers on the network. The socket is bound to the port number so that the transport layer can identify the
application
to which the data is intended to be sent.

### Server

Usually the server runs on a specific computer on the network and has a socket tied to a specific port number. In
our case, we will use the same computer as the client and run the server on port `12345`:
`ServerSocket serverSocket = new ServerSocket(port);`

The server is just waiting, listening on the socket so that the client can make a connection request. This happens at
the next stage:
`Socket clientSocket = serverSocket.accept();`

When the server code encounters the acceptance method, it is blocked until the client makes a connection request to it.

If everything goes well, the server accepts the connection. After acceptance, the server receives a new clientSocket
bound
to the same local port `12345`, and also sets its remote endpoint to the client's address and port.

At this stage, the new `Socket` object establishes a direct connection between the server and the client. Then we can
access the
output and input streams to write and receive messages from and from the client, respectively:
`BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));`
`BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));`

Now the server is able to exchange messages with the client indefinitely until the socket closes with its threads.

However, in our example, the server can only send a greeting response before closing the connection. This means that
if we run the test again, the server will refuse to connect.

To ensure continuity of communication, we will have to read the input stream inside the `while` loop and exit only then,
when the client sends a completion request. We'll see this in action in the next section.

For each new client, the server needs a new socket returned by the accept call. We use `ServerSocket`
to
continue listening for connection requests while meeting the needs of connected clients. We haven't
taken this into account in our first example yet.

### Client

The client must know the hostname or IP address of the machine on which the server is running and the port number that
the server is listening to.

To make a connection request, the client tries to meet with the server on the server machine and port:
`Socket socket = new Socket(host, port);`

The client also needs to identify itself on the server so that it binds to the local port number assigned
by the system that it will use during this connection. We don't do it ourselves.

The above constructor creates a new socket only when the server has accepted the connection, otherwise we
will get a connection failure exception. After successful creation, we can get input and output streams from it to
communicate with the server:
`BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));`
`PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);`
The client input stream is connected to the server output stream in the same way as the server input stream is connected
to
the client output stream.
</details>


<details>
<summary>Сокеты</summary>

# Какие бывают протоколы передачи данных?

**Сетевые протоколы передачи данных** — перечень правил, определяющих особенности и порядок передачи информации.

- **IP — Internet Protocol**

Первым объединил отдельные ПК в единую сеть. Можно сказать, что этот протокол является наиболее простым. А еще он
ненадежен, ведь он не подтверждает доставку пакетов получателю, как и не контролирует целостность данных. По
IP-протоколу передача данных происходит без установки соединения.

Главная задача IP — маршрутизация датаграмм, то есть речь идет об определении пути следования данных по узлам сети. До
сего дня наиболее популярной версией являлся IPv4 с 32-битными адресами. Но, как известно, 4.29 млрд IPv4-адресов — это
много, но уже давно недостаточно. Поэтому существует IPv6, который призван решить проблему переполнения адресов.

- **TCP/IP — Transmission Control Protocol/Internet Protocol**

Это уже стек протоколов TCP и IP. TCP обеспечивает и контролирует передачу данных и следит за надежностью и
целостностью. IP отвечает за маршрутизацию. Протокол TCP нередко используется другими, более комплексными протоколами.

 - **UDP — User Datagram Protocol**

Обеспечивает передачу данных, не создавая предварительного соединения между ними. UDP считают недостаточно надежным, т.
к. пакеты могут не только не дойти, но и продублироваться либо прийти не по порядку.

Но есть и преимущество: скорость доставки данных. Именно поэтому в приложениях, особо чувствительных к сетевым
задержкам, нередко применяют UDP.

 -  **FTP — File Transfer Protocol**

Служит для передачи файлов. Этот протокол не новый -- его успешно применяли задолго до появления IP. Он и сегодня
используется при организации удаленного доступа к хостингам.

Надежен, гарантирует передачу данных, функционирует по принципу клиент-серверной архитектуры. Для работы с файловой
системой сервера пользователь проходит аутентификацию (анонимный вариант тоже возможен), после чего получает доступ.

 -  **DNS**

DNS представляет собой не только систему доменных имён (Domain Name System). Это еще и протокол, без которого данная
система работать бы не смогла. Протокол дает возможность клиентским компьютерам запрашивать у DNS-сервера IP-адрес
какого-нибудь сайта, плюс он помогает осуществлять обмен БД между серверами DNS. В работе системы также используются
протоколы TCP и UDP.

 -  **HTTP — HyperText Transfer Protocol**

Поначалу это был протокол передачи HTML-документов. Сейчас он задействуется в целях передачи произвольных данных в сети.
Считается протоколом клиент-серверного взаимодействия без сохранения промежуточного состояния. В качестве клиента обычно
выступает web-браузер, хотя это может быть и поисковый робот. При обмене информацией протокол HTTP чаще всего использует
TCP/IP.

Протокол HTTP имеет расширение HTTPS, поддерживающее шифрование. В нем данные уже передаются поверх криптографического
протокола TLS.

 - **NTP — Network Time Protocol**

На самом деле, не все протоколы передачи используются для обмена классического вида информацией. Протокол NTP служит для
синхронизации локальных часов устройства со временем в глобальной/локальной сети. NTP задействует алгоритм Марзулло, в
результате чего выбирается наиболее точный источник времени. А еще NTP работает поверх UDP, что позволяет ему достигать
максимальной скорости передачи данных. В целом протокол довольно устойчив к изменениям задержек в глобальной/локальной
сети.

 -  **SSH — Secure SHell**
Обеспечивает удаленное управление ОС с применением TCP. В SSH шифруют весь трафик, при этом сохраняется возможность
выбора алгоритма шифрования. Это необходимо для передачи паролей и прочей важной информации.

А еще SSH дает возможность обрабатывать любые другие протоколы передачи данных. Таким образом, кроме удаленного
управления компьютером, через этот протокол вы сможете пропускать любые файлы либо даже аудио/видео-потоки.

SSH обычно применяют при работе с хостингами (клиент получает возможность удаленно подключиться к серверу и работать с
ним).

# Сокеты

Термин «программирование сокетов» относится к написанию программ, которые выполняются на нескольких компьютерах, на
которых все устройства подключены друг к другу через сеть.

Существует два протокола связи, которые мы можем использовать для программирования сокетов:

- протокол пользовательских дейтаграмм (UDP)
- протокол управления передачей (TCP)

Основное различие между ними заключается в том, что UDP не требует установления соединения, что означает отсутствие
сеанса между клиентом и сервером, тогда как TCP ориентирован на соединение, что означает, что для установления связи
между клиентом и сервером сначала должно быть установлено эксклюзивное соединение. .

## Настройка проекта

Java предоставляет набор классов и интерфейсов, которые заботятся о деталях низкоуровневого взаимодействия между
клиентом и сервером.

В основном они содержатся в пакете `java.net`, поэтому нам необходимо выполнить следующий импорт:
`import java.net.*;`
Нам также понадобится пакет `java.io`, который предоставляет нам потоки ввода и вывода для записи и чтения во время
общения:
`import java.io.*;`

Для простоты мы будем запускать клиентскую и серверную программы на одном компьютере. Если бы мы выполнили их на разных
сетевых компьютерах, единственное, что изменилось бы, — это IP-адрес. В этом случае мы будем использовать `localhost` по
адресу `127.0.0.1`.

## Простой пример

Давайте поработаем с самыми простыми примерами, связанными с клиентом и сервером. Это будет приложение для двусторонней
связи, в котором клиент приветствует сервер, а сервер отвечает.

Мы создадим серверное приложение в классе GreetServer.java со следующим кодом.

В этой статье мы добавим основной метод и глобальные переменные, чтобы привлечь внимание к тому, как мы будем
использовать все серверы. В остальных примерах этой статьи мы опустим такой повторяющийся код:

<details style="margin-left: 20px;">
<summary>Пример кода:</summary>

### серверная часть:

```java
import java.io.*;
import java.net.*;

public class SimpleServer {
    public static void main(String[] args) {
        // Задаем порт для подключения клиентов
        int port = 12345;
        try {
            // Создаем серверный сокет на определенном порту
            ServerSocket serverSocket = new ServerSocket(port);

            System.out.println("Сервер запущен и ожидает подключения...");

            // Ожидаем подключения клиента
            Socket clientSocket = serverSocket.accept();

            // Получаем входной и выходной потоки для общения с клиентом
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(), true);

            // Получаем сообщение от клиента
            String clientMessage = reader.readLine();
            System.out.println("Получено сообщение от клиента: " + clientMessage);

            // Преобразуем сообщение и отправляем его обратно клиенту
            String response = clientMessage.toUpperCase();
            writer.println(response);

            // Закрываем соединения
            reader.close();
            writer.close();
            clientSocket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

### клиентская часть:

```java
import java.io.*;
import java.net.*;

public class SimpleClient {
    public static void main(String[] args) {
        // Задаем порт и хост сервера
        int port = 12345;
        String host = "localhost";
        try {
            // Соединяемся с сервером по адресу и порту
            Socket socket = new Socket(host, port);

            // Получаем входной и выходной потоки для общения с сервером
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);

            // Отправляем сообщение серверу
            String message = "Привет, сервер!";
            writer.println(message);

            // Получаем и выводим ответ от сервера
            String response = reader.readLine();
            System.out.println("Ответ от сервера: " + response);

            // Закрываем соединения
            reader.close();
            writer.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

Как работает приложение

1. Сервер:

- Запускается и слушает порт 12345.
- При подключении клиента, сервер читает строку, преобразует её в верхний регистр и отправляет обратно.
- После отправки ответа сервер закрывает соединение.

2. Клиент:

- Подключается к серверу по адресу "localhost" и порту 12345.
- Отправляет строку "Привет, сервер!" серверу.
- Ждет и принимает ответ от сервера, выводит его в консоль и закрывает соединение.

Запустите сначала код сервера и только после того, как сервер будет запущен и ожидать подключения, запустите код
клиента. При успешной работе вы должны увидеть взаимодействие между клиентом и сервером через консоль.
</details>

<details style="margin-left: 20px;">
<summary>Пример веб-сокета:</summary>

```java
import java.io.*;
import java.net.*;

public class HttpServer {
    public static void main(String[] args) {
        int port = 8080; // стандартный порт для HTTP
        try {
            ServerSocket serverSocket = new ServerSocket(port);
            System.out.println("Сервер запущен на порту " + port);

            while (true) {
                Socket clientSocket = serverSocket.accept();
                BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));

                // Чтение HTTP-запроса от клиента
                String line;
                while (!(line = reader.readLine()).isEmpty()) {
                    System.out.println(line);
                }

                // Формирование и отправка HTTP-ответа
                String response = "<html><body><h1>Привет от сервера!</h1></body></html>";
                writer.write("HTTP/1.1 200 OK\r\n");
                writer.write("Content-Type: text/html; charset=utf-8\r\n");
                writer.write("Content-Length: " + response.length() + "\r\n");
                writer.write("\r\n");
                writer.write(response);

                // Закрытие потоков и сокета
                writer.flush();
                reader.close();
                writer.close();
                clientSocket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

Чтобы протестировать этот сервер:

1. Запустите код сервера.
2. Откройте ваш веб-браузер.
3. Введите в адресной строке `http://localhost:8080` и нажмите Enter.

</details>

## Как работают сокеты

По определению сокет — это одна из конечных точек двустороннего канала связи между двумя программами, работающими на
разных компьютерах в сети. Сокет привязан к номеру порта, чтобы транспортный уровень мог идентифицировать приложение,
которому предназначены данные для отправки.

### Сервер

Обычно сервер работает на определенном компьютере в сети и имеет сокет, привязанный к определенному номеру порта. В
нашем случае мы будем использовать тот же компьютер, что и клиент, и запустим сервер на порту `12345`:
`ServerSocket serverSocket = new ServerSocket(port);`

Сервер просто ждет, прослушивая сокет, чтобы клиент мог сделать запрос на соединение. Это происходит на следующем этапе:
`Socket clientSocket = serverSocket.accept();`

Когда код сервера встречает метод принятия , он блокируется до тех пор, пока клиент не сделает к нему запрос на
соединение.

Если все идет хорошо, сервер принимает соединение. После принятия сервер получает новый сокет clientSocket , привязанный
к тому же локальному порту `12345`, а также устанавливает его удаленную конечную точку на адрес и порт клиента.

На этом этапе новый объект `Socket` устанавливает прямое соединение сервера с клиентом. Затем мы можем получить доступ к
потокам вывода и ввода для записи и получения сообщений от клиента и от него соответственно:
`BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));`
`BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));`

Теперь сервер способен обмениваться сообщениями с клиентом бесконечно, пока сокет не закроется со своими потоками.

Однако в нашем примере сервер может отправить только ответ-приветствие, прежде чем закроет соединение. Это означает, что
если мы запустим тест еще раз, сервер откажется в соединении.

Чтобы обеспечить непрерывность связи, нам придется читать входной поток внутри цикла `while` и выходить только тогда,
когда клиент отправляет запрос на завершение. Мы увидим это в действии в следующем разделе.

Для каждого нового клиента серверу нужен новый сокет, возвращаемый вызовом принятия. Мы используем `serverSocket` ,
чтобы
продолжать прослушивать запросы на подключение, одновременно удовлетворяя потребности подключенных клиентов. Мы еще не
учли это в нашем первом примере.

### Клиент

Клиент должен знать имя хоста или IP-адрес машины, на которой работает сервер, и номер порта, который прослушивает
сервер.

Чтобы сделать запрос на соединение, клиент пытается встретиться с сервером на машине и порту сервера:
`Socket socket = new Socket(host, port);`

Клиенту также необходимо идентифицировать себя на сервере, чтобы он привязывался к номеру локального порта, назначенному
системой, который он будет использовать во время этого соединения. Мы сами этим не занимаемся.

Приведенный выше конструктор создает новый сокет только тогда, когда сервер принял соединение, в противном случае мы
получим исключение отказа в соединении. После успешного создания мы можем получить от него входные и выходные потоки для
связи с сервером:
`BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));`
`PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);`
Входной поток клиента подключен к выходному потоку сервера точно так же, как входной поток сервера подключен к выходному
потоку клиента.
</details>
