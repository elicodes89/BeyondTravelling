import React, { useState } from 'react';
import Button from 'react-bootstrap/Button';
import CityHotels from './CityHotels';
import ComplexButton from "./ComplexButton";


const HotelDetail = (props) => {
  const [selectedCity, setSelectedCity] = useState(null);
  const region = props.region;
  const cities = region.cities;

  const citiesList = cities.map((city, index) => {
    return <div><ComplexButton onClick = {() => onCityClick(city) }>{city.name}</ComplexButton></div>
  })

  const onCityClick = function(city){
    setSelectedCity(city);
}

  if (region != undefined && region.cities.length != 0 && !selectedCity) {
    return (
      <>
      {/* <a> {region.name} </a> */}
      <li>{citiesList}</li>
      </>
    )
  } else if(selectedCity){
    return (
      <>
      <CityHotels selectedCity={selectedCity}/>
      </>
    )
  }
  else {
    return (
      <>
      {/* <a> {region.name} </a> */}
      <h1>no cities, so no click</h1>
      </>
    );
  };
};

export default HotelDetail;