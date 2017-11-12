import { Component, OnInit, ViewEncapsulation } from '@angular/core';

import {FormsModule} from '@angular/forms';

import {Faceuser} from '../faceuser.interface';
import {FaceuserService} from '../faceuser.service';

@Component({
  selector: 'faceuser-form',
  templateUrl: './faceuser-form.component.html',
  styleUrls: ['./faceuser-form.component.css'],
  encapsulation: ViewEncapsulation.None
})
export class FaceuserFormComponent implements OnInit {

  faceuser: Faceuser = {faceUsername: '', facePassword: ''};
  constructor(private faceuserService: FaceuserService) {}

  ngOnInit() {
  }

  onSubmit(){
    this.faceuserService.createFaceuser(this.faceuser).subscribe(
      value => {
        console.log('[POST]  successfully', value);
      }, error => {
        console.log('FAIL !');
      },
      () => {
        console.log('POST Faceuser - now completed.');
      });
  }

}
