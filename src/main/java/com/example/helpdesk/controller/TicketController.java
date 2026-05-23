package com.example.helpdesk.controller;

import com.example.helpdesk.repository.TicketRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.helpdesk.model.TicketStatus;

@Controller
public class TicketController {

    private final TicketRepository ticketRepository;

    public TicketController(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    @GetMapping("/tickets")
    public String tickets(Model model) {
        model.addAttribute("tickets",
                ticketRepository.findAllByOrderByCreatedAtDesc());
        return "tickets";
    }

    @GetMapping("/tickets/new")
    public String newTickets(Model model) {
        model.addAttribute("tickets",
                ticketRepository.findByStatus(TicketStatus.NEW));
        return "tickets";
    }
}
