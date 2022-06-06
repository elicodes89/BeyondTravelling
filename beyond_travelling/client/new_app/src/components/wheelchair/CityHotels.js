import React, { useState } from 'react';
import Button from 'react-bootstrap/Button';

const CityHotels = (props) => {
const [selectedCityHotel, setSelectedCityHotel] = useState(null);
const selectedCity = props.selectedCity;
const cityHotels = selectedCity.hotels;

  const cityHotelsList = cityHotels.map((cityHotel, index) => {
    return <div>
      <Button variant="light" onClick = {() => onCityClick(cityHotel) }>{cityHotel.hotel_name}<br/><img src={cityHotel.img} alt= "hotel_collage" width = "200px" /></Button></div>

  })

  function task(){
    console.log(cityHotelsList)
  }
  setTimeout(task, 1000);

  const onCityClick = function(cityHotel){
    setSelectedCityHotel(cityHotel);
}

  if (selectedCity != undefined && selectedCityHotel === null) {
    return (
      <>
      <p>{cityHotelsList}</p>
      </>
    )  
} else if(selectedCityHotel != null){
  return (
  <div>
    <h2>{selectedCityHotel.hotel_name}</h2> 
{/* make sure you fix this elisol */}
    <li><img src={selectedCityHotel.img2}/></li>  
    <li><a href= {selectedCityHotel.website} target="_blank">Click here to make a booking</a></li>
    <li>Contact Number: {selectedCityHotel.contact_number}</li>
    <li>Address: {selectedCityHotel.address}</li>
    <li>{selectedCityHotel.comments[0].name}</li>
    <li>{selectedCityHotel.comments[1].name}</li>
    <li>{selectedCityHotel.comments[2].name}</li>
    <li>{selectedCityHotel.comments[3].name}</li>
    <li>{selectedCityHotel.comments[4].name}</li>

    <iframe width="560" height="315" src={selectedCityHotel.videos[1].name} title="Video" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
  </div>
  
  )  
}
else {
  return (
    <>
    <h1>Oops. Try Again.</h1>
    </>
  );
};
};

export default CityHotels;