# demo-api-spark-mongodb
This is a REST API sample app which demonstrate interactions with MongoDB server. The REST API is built using Java, Spark micro web framework, Morphia ORM library

## What you will see in the demo
When you run the sample, a HTTP server will run and host the program on port 4567. The program exposes `/api/v1/gamingPc` resource path where it returns a list of JSON objects when you browse the path or invoke it through using curl or Postman.

## Technology used for building this demo
* Java programming language with few lines calling Java 8's lambda.
* Spark, Java micro web framework for the REST API part.
* Morphia, MongoDB ORM for Java.
* MongoDB Driver for Java.
* Guice, Google's Dependency Injection library for Java.
* Maven, for managing denpendencies and providing clean-build-package & run commands.

## What demo's parts that are not included in this repo
* The demo's data. You could grab it from here: `https://github.com/WendySanarwanto/data-for-researches/` and import it into your mongodb server.

## How to run this sample
* Pull this repository into your local machine through running `git clone https://github.com/WendySanarwanto/demo-api-spark-mongodb.git` command in your CLI terminal.
* Go to inside the cloned repository's directory, then run `./build.sh` command or `mvn package` command for building the source code. 
* Run `./run.sh` or `mvn exec:java -Dexec.mainClass="com.wendysa.apidemo.Main"` command to start the application. 
* Open your browser then browse to `http://localhost:4567/api/v1/gamingPc` path. Confirm that you will get a list of JSON objects.

## What are remanining parts that need to be done in near future ?
* Pulling the record's nested details. Need to make the changes in current model class and add more new model classes to address this.
* The unit test, I have not done it yet.
* Creating POST, PUT , DELETE resources. I welcome for anyone whom like to work on this parts and looking forward for your pull requests.

## What are `nice to have` features that would improve the demo becoming better
* Supports for Asynchronous process on handling incoming GET, POST, PUT, DELETE requests on API side
* Supports for asynchronous mongodb driver. 

## Benchmark
I benchmarked the GET resource path using `wrk` HTTP benchmarking tool (https://github.com/wg/wrk) using this command `wrk -c 256 -t 32 -d 10 http://localhost:4567/api/v1/gamingPc` ( 256 connections, 32 threads, run the test for 10 seconds). Here are the results:
* 1st run: Requests/sec:    845.83
* 2nd run: Requests/sec:    407.19 with 78 requests were timed out and 27 calls received non-2xx or 3xx responses
* 3rd run: Requests/sec:    462.62 with 256 requests were timed out


