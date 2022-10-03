let gadgetList = [
    {
      brand: "iPhone",
      model: "12 Pro",
      priceUSD: 1200,
      ramGb: 6,
      memory: 128,
      option: "double front back camera",
    },
    {
      brand: "Xiaomi",
      model: "RedMi Note 8",
      priceUSD: 250,
      ramGb: 6,
      memory: 64,
      option: "3 cameras in back",
    },
    {
      brand: "Asus",
      model: "Tuf Gaming Pro",
      priceUSD: 1500,
      ramGb: 24,
      memory: "SSD 1 Tb",
      option: "RX Radeon",
    },
    {
      brand: "Samsung",
      model: "Galaxy Note 13",
      priceUSD: 999,
      ramGb: 4,
      memory: 256,
      option: "front back cameras",
    },
  ];
  for (let i = 0; i < gadgetList.length; i++) {
    let divElem = document.createElement("div");
    divElem.id = divElem;
    

    divElem.innerHTML =
      gadgetList[i].brand +
      " " +
      gadgetList[i].model +
      " " +
      gadgetList[i].priceUSD +
      " " +
      gadgetList[i].ramGb +
      " " +
      gadgetList[i].memory +
      " " +
      gadgetList[i].option;

    let buttonElem = document.createElement("button");
    buttonElem.innerHTML = "+ add to basket"

    container.append(divElem);
    divElem.append(buttonElem);
  }