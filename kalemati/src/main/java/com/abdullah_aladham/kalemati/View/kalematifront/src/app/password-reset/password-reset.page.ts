import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { IonicModule } from '@ionic/angular';


@Component({
  selector: 'app-password-reset',
  templateUrl: './password-reset.page.html',
  styleUrls: ['./password-reset.page.scss'],
  standalone: true,
  imports: [IonicModule, CommonModule, FormsModule]
})
export class PasswordResetPage implements OnInit {

  //constructor() { }

  ngOnInit() {

  }
 // constructor(public afAuth: AngularFireAuth) { }
  /* newpass: string;
   cpass: string;*/
  //async reset_pass() {
  //const { newpass, cpass } = this;
  //try {
  //kind of a hack
  //      const res = await this.afAuth.
  //alert('i am done');

  //catch (err) {
  //console.dir(err);
  //if (err.code === "auth/user-not-found") {
  // console.log('user not found');
  //}
  // }

  //}

}
