package main;

import oberver.Observer;
import oberver.WeixinUser;
import subject.SubjectReal;

public class TestMain {
	public static void main(String[] args) {
		SubjectReal mSubject = new SubjectReal();
		WeixinUser ob1 =new WeixinUser("gong");
		WeixinUser ob2 =new WeixinUser("gui");
		WeixinUser ob3 =new WeixinUser("wei");
		
		mSubject.attach(ob1);
		mSubject.attach(ob2);
		mSubject.attach(ob3);
		
		mSubject.notify("updated!");
		mSubject.delTache(ob3);
		mSubject.notify("updated!!!!");



		
		}

}
