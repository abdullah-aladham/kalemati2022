import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { IonicModule } from '@ionic/angular';

@Component({
  selector: 'app-mycards-explore',
  templateUrl: './mycards-explore.page.html',
  styleUrls: ['./mycards-explore.page.scss'],
  standalone: true,
  imports: [IonicModule, CommonModule, FormsModule]
})
export class MycardsExplorePage implements OnInit {

  imagesrc:any;
  image:any;
  constructor() {
    this.imagesrc = 'سكين';
    //this.getPhotoUrl();
  }

  getPhotoUrl() {
   
  }

  ngOnInit() {
  }
  

}
