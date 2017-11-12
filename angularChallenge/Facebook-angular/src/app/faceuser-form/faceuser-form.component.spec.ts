import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { FaceuserFormComponent } from './faceuser-form.component';

describe('FaceuserFormComponent', () => {
  let component: FaceuserFormComponent;
  let fixture: ComponentFixture<FaceuserFormComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ FaceuserFormComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(FaceuserFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
