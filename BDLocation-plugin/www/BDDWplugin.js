var exec = require('cordova/exec');

exports.getLocation = function(arg0, success, error) {
    exec(success, error, "BDDWplugin", "getLocation", [arg0]);
};
