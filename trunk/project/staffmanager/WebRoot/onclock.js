function clockon(bgclock) {
	var now = new Date();
	var year = now.getYear();
	var month = now.getMonth();
	var date = now.getDate();
	var day = now.getDay();
	var hour = now.getHours();
	var minu = now.getMinutes();
	var sec = now.getSeconds();
	var week;
	month = month + 1;
	if (month < 10) {
		month = "0" + month;
	}
	if (date < 10) {
		date = "0" + date;
	}
	if (hour < 10) {
		hour = "0" + hour;
	}
	if (minu < 10) {
		minu = "0" + minu;
	}
	if (sec < 10) {
		sec = "0" + sec;
	}
	var arr_week = new Array("\u661F\u671F\u65E5","\u661F\u671F\u4E00","\u661F\u671F\u4E8C","\u661F\u671F\u4E09","\u661F\u671F\u56DB","\u661F\u671F\u4E94","\u661F\u671F\u516D");
	week = arr_week[day];
	var time = "";
	time = year + "\u5e74" + month + "\u6708" + date + "\u65e5" + week + "" + hour + "" + ":" + minu + ":" + sec;
	if (document.all) {
		bgclock.innerHTML = "[" + time + "]";
	}
	var timer = setTimeout("clockon(bgclock)", 200);
}