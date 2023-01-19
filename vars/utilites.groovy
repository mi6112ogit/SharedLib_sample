def checkout() {
  stage("checkout") {
    echo "checkout"
  }
}

def compile() {
  stage("compile") {
    echo "compile"
  }
}

def deploy() {
  stage("deploy") {
    echo "deploy"
  }
}

def hello(String name = 'hoge') {
  stage("hello") {
    echo "hello, ${name}"
  }
}