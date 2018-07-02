cp override/EventsApiClassTest.java src/test/java/io/swagger/client/api/EventsApiClassTest.java

if [ "$(uname)" == "Darwin" ]; then
    # Do something under Mac OS X platform
    sed -i "" 's/<name>client<\/name>/<name>Clever Java Client<\/name>/g' pom.xml
elif [ "$(expr substr $(uname -s) 1 5)" == "Linux" ]; then
    # Do something under GNU/Linux platform
    sed -i"" 's/<name>client<\/name>/<name>Clever Java Client<\/name>/g' pom.xml
fi
