 private int re;
  private int im;
  
  public int getRe() {
    return re;
  }
  
  public void setRe(int re) {
    this.re = re;
  }
  
  public int getIm() {
    return im;
  }
  
  public void setIm(int im) {
    this.im = im;
  }
  
  public Cmplx(int r, int i) {
    this.re = r;
    this.im = i;
  }
  
  public Cmplx(int r) {
    this.re = r;
    this.im = 0;
  }
  
  public Cmplx() {
    this.re = 0;
    this.im = 0;
  }
  
  @Override
  public String toString() {
    return re + " + " + im + "i";
  }
  
  public Cmplx add(Cmplx x) {
    int sumRe = this.re + x.re;
    int sumIm = this.im + x.im;
    return new Cmplx(sumRe, sumIm);
  }
  
  public static Cmplx mult(Cmplx c1, Cmplx c2) {
    int multRe = c1.re * c2.re - c1.im * c2.im;
    int multIm = c1.re * c2.im + c1.im * c2.re;
    return new Cmplx(multRe, multIm);
  }
}
