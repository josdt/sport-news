package com.example.ApiDoAn.request;

import java.util.Date;
import java.util.List;

import javax.persistence.Lob;

public class ProductRequest {
public long id;
  public String name;
  public String descriptions;
  public Date importDate;
  public long  categoryId;
  public List<Image> ImageEntity;
  
}
