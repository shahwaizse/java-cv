setting up a stable openCV development environment was probably the most frustrating thing in this project,
so here's a mini tutorial for windows:
-> download intellij (for the love of god please don't use eclipse it's ugly and not beginner friendly).
-> download the openCV exe for windows and in the installer set the location to the C:/ folder.
-> make a new project in intellij, default settings, name it whatever you like.
-> go to files->project structure->modules->dependancies.
-> click the + icon, select the .jar in the opencv folder made in step 2 (opencv/build/java/.jar file)
-> the entry should show up in the dependancies section, double click it.
-> click the + icon, select opencv/build/java/x64 (or x86 depending on your platform)
-> click and apply and import the libraries in your code through org.opencv.*
-> enjoy developing shitty code in a shitty programming language (c# is better screw you java fans).