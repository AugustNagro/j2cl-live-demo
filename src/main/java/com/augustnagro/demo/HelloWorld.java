package com.augustnagro.demo;

import jsinterop.annotations.JsType;

import static elemental2.dom.DomGlobal.document;

@JsType
public class HelloWorld {
  public static void main() {
    document.getElementById("content").innerHTML = "<h1>Hello World!</h1>";
  }
}