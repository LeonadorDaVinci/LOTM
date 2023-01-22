# LOTM
A console game.
This is an unfinished project, and only a small part of the original plan has been done. Unfortunately, I probably won't go ahead and finish it. So I hope, someone can finish this project for me.
I don't know if I'll see this project completed in my lifetime lol I'm looking forward to it.
If you are ready to take over this project, I will tell you the whole project plan, and some details.
Before typing the first line of code that doesn't belong to me on this project, please read a web novel (Lord of the Mysteries)
Link to the novel: https://www.webnovel.com/book/lord-of-mysteries_11022733006234505
After reading it, you may have realized a few things.
This project aims to simulate life as an ordinary person in the world of "Lord of the Mysteries".
Basic structure: major events (equivalent to one volume in the original book), medium events (equivalent to 1/3 volumes in the original book), small events (equivalent to chapters 3-10 in the original book). Large events, medium events, and small events belong to the containment relationship. The end of each major event will bring a plot climax. In order to distinguish the plot process and various events, I set a global variable. This variable will only be changed after the completion of the middle event and the big event. (The effect is equivalent to forcing the plot forward, so that the player cannot go back to the past)
After choosing the place of birth and birth background, immediately enter the first small event in the first big event, characters with different backgrounds will encounter different events.
Project IDE: JetBrains Intellij IDEA CE
The entire project is mainly based on the java language (95% java). Currently there is a main process that cannot be paused, a sub-process that cannot be paused (java swing) and a sub-process that can be paused (background music).
The source code path of the main process (public static main) is MavenLOTM/src/main/java/com/leonadordavinci/main.java.
After the user passes the disclaimer, two sub-processes (java swing and background music) are started. Among them, java swing is a panel with auxiliary functions. You can enter various commands to get feedback, and you can also set the game playing method on its setting interface . Its source code path is MavenLOTM/src/main/java/com/leonadordavinci/DataQueryerRelated/DataQueryer.java
If you don't like to use java swing, you can also choose JavaFX.
MainStorge and main.java are in a folder, which stores all the global variables in the project. You can guess its purpose according to the variable name, or you can add some global variables yourself.
Some tool classes are stored in utils.
Most of the text is stored in Text.
The module of the sealed item is mainly constructed in the form of json.
Game saves, which I originally planned to store in a directory as json.
That's all there is to say, good luck.
PS: You can modify the language in the project and change Chinese to your native language.
