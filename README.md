# Phone Number Validator
The app starts off with a cover
screen containing a welcome message and two buttons arranged vertically below the welcome message. The
functionality of the two buttons is explained below.<br/>
<br/>
1. If the user selects the top button, the app uses an explicit intent to start a second activity, which
contains a text editor window and a button. The text editor window is initially empty. The user then
types some text. Embedded in the text could be a phone number in the following format “(xxx) yyyzzzz”
or “(xxx)yyy-zzzz”. (Both formats must be supported by the app.) When the text (possibly
containing a phone number) is complete, the user will press the button. Now the app will look for a
phone number embedded in the text typed by the user. If a phone number conforming to one of the
above formats is found, 
app will use an implicit intent to open the predefined dialer activity in
the Phone app of the emulator, without dialing the number. Otherwise, no action is taken.<br/>
<br/>
2. If the user selects the bottom button, the app will use an implicit intent to start an activity in a
browser contained in the emulator and open the Android documentation page:
https://developer.android.com/index.html<br/>
<br/>
*PS: Tested by using Nexus 5 virtual device running the Android platform (API 23—Marshmallow). No backward compatibility provided.*
