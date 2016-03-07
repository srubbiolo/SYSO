// Create a new Firebase reference, and a new instance of the Login client
var chatRef = new Firebase('https://radiant-torch-8530.firebaseio.com/chat');
https://auth.firebase.com/v2/radiant-torch-8530/auth/facebook/callback
function login() {
  chatRef.authWithOAuthPopup("facebook", function(error, authData) {
	  if (error) {
		    console.log("Login Failed!", error);
		  } else {
		    console.log("Authenticated successfully with payload:", authData);
		  }
		});
}

chatRef.onAuth(function(authData) {
  // Once authenticated, instantiate Firechat with our user id and user name
  if (authData) {
    initChat(authData);
  }
});
function initChat(authData) {
  var chat = new FirechatUI(chatRef, document.getElementById('firechat-wrapper'));
  chat.setUser(authData.uid, authData[authData.provider].displayName);
}