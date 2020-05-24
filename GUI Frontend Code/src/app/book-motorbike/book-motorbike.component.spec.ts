import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BookMotorbikeComponent } from './book-motorbike.component';

describe('BookMotorbikeComponent', () => {
  let component: BookMotorbikeComponent;
  let fixture: ComponentFixture<BookMotorbikeComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BookMotorbikeComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BookMotorbikeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
