import { Component, OnInit, ViewEncapsulation } from '@angular/core';
import { News } from './news';
import { Headers, Http } from '@angular/http';
import { Router } from '@angular/router';
import { NewsService } from './news.service';



@Component({
  selector: 'app-news',
  templateUrl: './news.component.html',
  styleUrls: ['./news.component.css'],
  encapsulation: ViewEncapsulation.None
})


export class NewsComponent implements OnInit {

  CurrentNews: News[];
  
  //
  
  constructor(private route: Router, private newsservice: NewsService) { }

  ngOnInit() {
    this.getNews();
  }

  getNews(): void {
    this.newsservice.getNews().subscribe( result => {
      this.CurrentNews = result;
    });
    // this.newsservice.getNews().then(CurrentNews => {
    //   console.log(this.CurrentNews);
    //   this.CurrentNews = CurrentNews});
    
  }

  
}
